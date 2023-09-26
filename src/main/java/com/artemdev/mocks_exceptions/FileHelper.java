package com.artemdev.mocks_exceptions;

import java.io.File;

// Написать тесты, включая проверку исключения, на метод getFileByPath класса FileHelper

public class FileHelper {
    public File getFileByPath(String path) {
        if (path.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return new File(path);
    }
}
