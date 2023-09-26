package com.artemdev.mocks_exceptions;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileHelperTest {

    @Test
    public void getFileByPathTest() {
        FileHelper fileHelper = new FileHelper();
        File expectedFile = fileHelper.getFileByPath("D://1.txt");
        assertNotNull(expectedFile);
        assertThat(expectedFile.getAbsolutePath(), CoreMatchers.startsWith("D"));
        assertTrue(expectedFile.exists());
    }
}
