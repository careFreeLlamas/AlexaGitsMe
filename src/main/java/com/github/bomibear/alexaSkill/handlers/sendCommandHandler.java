package com.github.bomibear.alexaSkill.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.impl.IntentRequestHandler;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class sendCommandHandler implements IntentRequestHandler {
  @Override
  public boolean canHandle(HandlerInput input, IntentRequest intentRequest) {
    return input.matches(intentName("sendCommandIntent"));
  }

  @Override
  public Optional<Response> handle(HandlerInput input, IntentRequest intentRequest) {
    // send a message to slack
    return Optional.empty();
  }
}
