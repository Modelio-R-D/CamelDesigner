package fr.softeam.cameldesigner.handlers.propertypages.metadata;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;


public class MmsPropertyPropertyPage<T extends MmsProperty> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
	
    private List<ModelElement> _domain = null;
    private List<ModelElement> _range = null;

    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {

        case 1 :
        	 Class elt = (Class) getModelElt(this._domain, value);
             if (MmsConcept.canInstantiate(elt)) {
                 this._element.setDomain(MmsConcept.safeInstantiate(elt));
             }
        	break;
        	
        case 2 :
        	 this._element.setPropertyType(value);;
        	break;
        	
        case 3 :
        	Class eltt = (Class) getModelElt(this._range, value);
            if (MmsConcept.canInstantiate(eltt)) {
                this._element.setRange(MmsConcept.safeInstantiate(eltt));
            }
            break;
       	
        case 4 :
          	this._element.setRangeUri(value);;
          	break;
       	
        }
        
        this._currentRow -= 4;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     *
     * @param table : the property table to fulfill
     */
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Domain
        this._domain = MmsConcept.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Domain", getCamelName(this._element.getDomain()), getCamelNames(this._domain));

        // Property Type
        table.addProperty("Property Type",  getValue(this._element.getPropertyType()));
        
        //Range
        this._range= MmsConcept.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Range", getCamelName(this._element.getRange()), getCamelNames(this._range));

        //Range URI
        table.addProperty("Range Uri",  getValue(this._element.getRangeUri()));
       
    }

    public MmsPropertyPropertyPage(T elt) {
        super(elt);
    }

}
