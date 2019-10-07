package com.github.bomibear.alexaSkill.handlers;

import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class AlexaStreamHandler extends SkillStreamHandler {
    public AlexaStreamHandler() {
        super(Skills.standard()
                .addRequestHandler(new WelcomeRequestHandler())
                .addRequestHandler(new CustomLaunchRequestHandler())
                .build());
    }
}
