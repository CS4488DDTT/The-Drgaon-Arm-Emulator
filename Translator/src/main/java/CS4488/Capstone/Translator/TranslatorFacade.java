/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CS4488.Capstone.Translator;



import CS4488.Capstone.Library.BackEndSystemInterfaces.TranslatorInterface;
import CS4488.Capstone.Library.Tools.Hex4d;
import org.apache.commons.text.WordUtils;

import java.util.ArrayList;

public class TranslatorFacade implements TranslatorInterface {

    @Override
    public boolean loadFile(String path) {
        return false;
    }

    @Override
    public void clearFile() {

    }

    @Override
    public boolean isTranslatable() {
        return false;
    }

    @Override
    public ArrayList<Hex4d> translateToMachine() {
        return null;
    }

    @Override
    public String getLastExceptionMessage() {
        return null;
    }
}
