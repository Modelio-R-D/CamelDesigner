package fr.softeam.cameldesigner.handlers.propertypages.metadata;

import java.util.Arrays;
import camel.mms.MmsPropertyType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("1ccba304-5c60-4898-b98a-19a8261c420f")
public class MmsPropertyPropertyPage<T extends MmsProperty> extends MmsObjectPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("35ee74cf-beed-44ed-86ba-22146bf8f940")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
        //            Class elt = (Class) getModelElt(MmsConcept.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
        //            if (MmsConcept.canInstantiate(elt)) {
        //                this._element.setDomain(MmsConcept.safeInstantiate(elt));
        //            }
        //        }
        //        else if(this._currentRow == 2){
                this._element.setPropertyType(value);
        }
        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(MmsConcept.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (MmsConcept.canInstantiate(elt)) {
                this._element.setRange(MmsConcept.safeInstantiate(elt));
            }
        }
        else if(this._currentRow == 4){
            this._element.setRangeUri(value);
        }
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("afb4dafb-f880-42bc-8a6c-622ffe93886f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //         //Domain
        //        table.addProperty("Domain", getCamelName(this._element.getDomain()), getCamelNames(MmsConcept.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //PropertyType
        String[] values = Arrays.stream(MmsPropertyType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Property Type", getNotNull(this._element.getPropertyType()), values);
        
        //Range
        table.addProperty("Range", getCamelName(this._element.getRange()), getCamelNames(MmsConcept.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //RangeUri
        table.addProperty("Range Uri", getNotNull(this._element.getRangeUri()));
    }

    @objid ("28140af8-d3db-4ceb-9e0e-bb5ff3c85788")
    public MmsPropertyPropertyPage(T elt) {
        super(elt);
    }

}
