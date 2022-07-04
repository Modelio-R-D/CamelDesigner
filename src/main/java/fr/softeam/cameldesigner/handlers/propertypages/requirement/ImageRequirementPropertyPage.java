package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ffbce9e5-a419-4946-9b05-92bd89f20b70")
public class ImageRequirementPropertyPage<T extends ImageRequirement> extends HardRequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("84b22c79-0dd6-476d-94b7-4eb8eb23ad21")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("dca67c77-0644-4354-b161-d0ccf34a1281")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
              //Images
        String images = "";
        for(  String image: this._element.getImages()) {
            images +=    image  + " ";
        }
        table.addProperty("Images", images);
    }

    @objid ("4315868d-faf8-4b41-aa92-6d173d5141f6")
    public ImageRequirementPropertyPage(T elt) {
        super(elt);
    }

}
