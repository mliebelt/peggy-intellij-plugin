package com.github.mliebelt.peggyintellijplugin.language;

import com.intellij.lang.Language;

public class PeggyLanguage extends Language {
    public static final PeggyLanguage INSTANCE = new PeggyLanguage();
    private PeggyLanguage() {
        super("Peggy");
    }
}
