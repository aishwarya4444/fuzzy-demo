package com.fuzzy.fuzzydemo.mytest;

import me.xdrop.fuzzywuzzy.FuzzySearch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.codec.language.Soundex;

@RestController
public class FuzzyResource {

    @GetMapping(path = "/fuzzy")
    public FuzzyResponse CalculateScore(@RequestBody Names names) {
        String str1 = names.getOldName();
        String str2 = names.getNewName();

        Soundex soundex = new Soundex();
        String sound1 = soundex.encode(str1);
        String sound2 = soundex.encode(str2);
        int similarity = FuzzySearch.ratio(sound1, sound2); // Use partialRatio for partial matching

        return new FuzzyResponse(sound1, sound2, similarity);
    }
}
