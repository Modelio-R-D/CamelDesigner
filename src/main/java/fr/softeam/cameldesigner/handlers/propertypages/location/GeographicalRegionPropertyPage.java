package fr.softeam.cameldesigner.handlers.propertypages.location;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
public class GeographicalRegionPropertyPage<T extends GeographicalRegion> extends NamedElementPropertyPage<T> {
    
    private List<ModelElement> _parentRegions = null;

	/**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {

        case 1 :
        	
           this._element.getParents();
           
           break;
        }
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

        //Parent Regions 
        this._parentRegions = GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Parent Regions", getCamelName(this._element.getParents(), getCamelNames(this._parentRegions)));

        //Alternative names
        table.addProperty("Alternative names", getValue(this._element.getAlternativesNames()));
        
    }

    public GeographicalRegionPropertyPage(T elt) {
        super(elt);
    }

}
