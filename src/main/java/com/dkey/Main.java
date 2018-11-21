package com.dkey;

import com.dkey.service.frontier.dto.Tsc;
import com.ibm.icu.text.Transliterator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static final String CYRILLIC_TO_LATIN = "Cyrillic-Latin";
    public static void main(String[] args) {
        LOGGER.info("Hello!!!");
        String st = "привет мир";

        Transliterator toLatinTrans = Transliterator.getInstance(CYRILLIC_TO_LATIN);
        String result = toLatinTrans.transliterate(st);
        LOGGER.info(result);

    }
}
