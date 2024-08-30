package com.cbl.app.card.controller;

import com.cbl.app.card.consumer.WikiMediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city-statement/app-card/api/wikimedia/v1")
@RequiredArgsConstructor
public class WikiMediaController {
    private final WikiMediaStreamConsumer wikiMediaStreamConsumer;

    @GetMapping
    public void startPublishing() {
        wikiMediaStreamConsumer.consumeStreamAndPublish();
    }

}
