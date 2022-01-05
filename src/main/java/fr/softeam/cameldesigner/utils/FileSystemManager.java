package fr.softeam.cameldesigner.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;

/**
 * @author kchaabouni
 */
@objid ("078494b5-c0d1-4979-b023-4d3a72d61276")
public class FileSystemManager {
    @objid ("07bb1d67-dea5-46d2-b9ac-6e0d21620b7e")
    public static final String PATH_PREDECESSOR = "..";

    /**
     * @return directory path or null if open dialog failed
     */
    @objid ("cd1ed646-24f1-43da-878a-ee7aa2257299")
    public static String getDialogDirectoryPath(String dialogText) {
        DirectoryDialog directoryDialog = new DirectoryDialog(Display.getDefault().getActiveShell());
        directoryDialog.setText(dialogText);
        return directoryDialog.open();
    }

    @objid ("5d336f30-931d-4f1b-8f6f-0ea7dfca387d")
    public static List<String> getFileDialogPath(String dialogText, String[] filterExtension) {
        FileDialog fileDialog = new FileDialog(Display.getDefault().getActiveShell());
        fileDialog.setText(dialogText);
        fileDialog.setFilterExtensions(filterExtension);
        
        List<String> selectedfilesPaths = new ArrayList<>();
        if (fileDialog.open() != null) {
          String[] filesPaths = fileDialog.getFileNames();
          for (int i = 0, n = filesPaths.length; i < n; i++) {
            StringBuffer buffer = new StringBuffer(fileDialog.getFilterPath());
            if (buffer.charAt(buffer.length() - 1) != File.separatorChar)
              buffer.append(File.separatorChar);
            buffer.append(filesPaths[i]);
            selectedfilesPaths.add(buffer.toString());
          }
        }
        return selectedfilesPaths;
    }

}
