package lesson19.Util;

import lombok.experimental.UtilityClass;

import java.util.Objects;
@UtilityClass

public class FileUtils {

    public String getFileExtension(String fileName){
        if (!Objects.isNull(fileName) && !fileName.isEmpty()){
            int dotIndex = fileName.lastIndexOf(".");
            return dotIndex <= fileName.length() ? fileName.substring(dotIndex) : null;
        }
        return null;
    }

}
