package com.github.bomibear.alexaSkill.handlers;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class AlexaStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                    new getCommandHandler(),
                    new sendCommandHandler(),
                    new CustomLaunchRequestHandler()
                )
                // Add your skill id below
                //.withSkillId("")
                .build();
    }

    public AlexaStreamHandler() {
        super(getSkill());
    }
}
