package com.github.bomibear.alexaSkill.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.impl.IntentRequestHandler;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.RequestHelper;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class getCommandHandler implements IntentRequestHandler {

  @Override
  public boolean canHandle(HandlerInput input, IntentRequest intentRequest) {
    return input.matches(intentName("getCommandIntent"));
  }

  @Override
  public Optional<Response> handle(HandlerInput input, IntentRequest intentRequest) {

    RequestHelper requestHelper = RequestHelper.forHandlerInput(input);

    // Use a helper method to get the slot value wrapped in an Optional.
    Optional<String> action = requestHelper.getSlotValue("action");
    Optional<String> actionThis = requestHelper.getSlotValue("this");
    Optional<String> thing = requestHelper.getSlotValue("thing");

    // get array of commands
    String[] s = new String[]{""};
    String commands = s.toString();
    // Use the Optional.map() method to build different responses depending on
    // whether the slot contained a value.
    String speechText = "Here are the commands you can use: " + commands + "Do you want me to send you these " +
        "commands?";

    return input.getResponseBuilder()
        .withSpeech(speechText)
        .build();
  }
}
