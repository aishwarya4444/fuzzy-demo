package com.fuzzy.fuzzydemo.mytest;

import me.xdrop.fuzzywuzzy.FuzzySearch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuzzyResource {

    @GetMapping(path = "/fuzzy")
    public int CalculateScore(@RequestBody Names names) {
        String str1 = names.getOldName();
        String str2 = names.getNewName();

        int similarity = FuzzySearch.tokenSortRatio(str1, str2); // Use partialRatio for partial matching

        return similarity;
    }
}
