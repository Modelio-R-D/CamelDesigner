package fr.softeam.cameldesigner.handlers.propertypages.type;

import java.util.Arrays;
import camel.type.PrimitiveType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("172d7d05-a381-4e1b-b651-8f200953b8b2")
public class ValueTypePropertyPage<T extends ValueType> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("f38430c0-ea14-40a0-984c-f5a4a015ad5c")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setPrimitiveType(value);
        }
        
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("a187f1a5-d2c1-4f25-b2fd-f8751972e515")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //PrimitiveType
        String[] values = Arrays.stream(PrimitiveType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Primitive type", getNotNull(this._element.getPrimitiveType()), values);
    }

    @objid ("fd24e177-d093-41bd-b58a-06ebfb0445f1")
    public ValueTypePropertyPage(T elt) {
        super(elt);
    }

}
