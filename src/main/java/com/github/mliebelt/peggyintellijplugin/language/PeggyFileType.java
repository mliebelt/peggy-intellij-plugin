package com.github.mliebelt.peggyintellijplugin.language;

import com.esotericsoftware.kryo.NotNull;
import com.intellij.openapi.fileTypes.LanguageFileType;

import javax.swing.*;

public final class PeggyFileType extends LanguageFileType {
    public static final PeggyFileType INSTANCE = new PeggyFileType();
    private PeggyFileType() {
        super(PeggyLanguage.INSTANCE);
    }

//    @NotNull
    @Override
    public String getName() {
        return "Peggy File";
    }

//    @NotNull
    @Override
    public String getDescription() {
        return "Peggy Grammar File";
    }

//    @NotNull
    @Override
    public String getDefaultExtension() {
        return "pegjs";
    }

    @Override
    public Icon getIcon() {
        return PeggyIcons.FILE;
    }
}
