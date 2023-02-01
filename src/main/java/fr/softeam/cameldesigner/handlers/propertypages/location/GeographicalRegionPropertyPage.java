package fr.softeam.cameldesigner.handlers.propertypages.location;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("c4645b49-5a42-4f63-a315-9de67ad4ef1f")
public class GeographicalRegionPropertyPage<T extends GeographicalRegion> extends LocationPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("183fa2dd-a883-453c-aac5-190c1fb4eb6e")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1) {
            Class elt = (Class) getModelElt(GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt!=null) &&(elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, GeographicalRegion.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addParentRegions((GeographicalRegion) mmsObj);
                }else {
                    this._element.removeParentRegions((GeographicalRegion) mmsObj);
                }
            }
        }
        
        else if(this._currentRow == 2) {
            for (String v : value.split(this._eltSeparator)){
                if (value.startsWith(this._add)) {
                    this._element.addAlternativeName(v);
                }else {
                    this._element.removeAlternativeName(v);
                }
            }
        }
        
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("b8cebff1-008a-461e-bbad-0f3f2d24133a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Parent Regions
        table.addProperty("Parent Regions", getCamelValue(this._element.getParentRegions()), getAddRemove(GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getParentRegions()));
        
        //Alternative Names
        table.addProperty("Alternative Names", String.join(this._eltSeparator, this._element.getAlternativeNames()));
        
        this._currentRow -= 2;
    }

    @objid ("36602fac-8a28-4e02-acb9-3af74ddb4095")
    public GeographicalRegionPropertyPage(T elt) {
        super(elt);
    }

}
