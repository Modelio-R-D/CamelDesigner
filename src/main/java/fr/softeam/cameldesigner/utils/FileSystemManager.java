package fr.softeam.cameldesigner.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;

/**
 * @author kchaabouni
 */
public class FileSystemManager {
    public static final String PATH_PREDECESSOR = "..";

    /**
     * @return directory path or null if open dialog failed
     */
    public static String getDialogDirectoryPath(String dialogText) {
        DirectoryDialog directoryDialog = new DirectoryDialog(Display.getDefault().getActiveShell());
        directoryDialog.setText(dialogText);
        return directoryDialog.open();
    }

    public static List<String> getFileDialogPath(String dialogText, String extension) {
        FileDialog fileDialog = new FileDialog(Display.getDefault().getActiveShell(), SWT.MULTI);
        fileDialog.setText(dialogText);
        String[] filterExtension = { extension };
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
