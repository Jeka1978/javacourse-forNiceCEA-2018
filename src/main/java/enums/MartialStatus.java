package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum MartialStatus {
    SINGLE(1, "RAVAK"), MARRIED(2, "NASUI"), DIVORCED(5, "GARUSH");

    @Getter
    private final int dbCode;
    @Getter
    private final String hebwerDesc;


    @SneakyThrows
    public static MartialStatus findByDbCode(int dbCode)  {
        MartialStatus[] statuses = values();
        for (MartialStatus status : statuses) {
            if (status.dbCode == dbCode) {
                return status;
            }
        }

        throw new Exception(dbCode + " not supported");
    }


    @Override
    public String toString() {
        return hebwerDesc;
    }





}



