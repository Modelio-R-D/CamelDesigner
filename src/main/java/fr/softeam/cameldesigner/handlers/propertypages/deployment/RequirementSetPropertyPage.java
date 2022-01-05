package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureClassPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Enumeration;

@objid ("6278c3cc-3109-48bc-b33a-84e3d48b26b2")
public class RequirementSetPropertyPage<T extends RequirementSet> extends FeatureClassPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("2ba473ea-e5d4-409c-8ac2-c5a4326e4b1a")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(ResourceRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (ResourceRequirement.canInstantiate(elt)) {
                this._element.setResourceRequirement(ResourceRequirement.safeInstantiate(elt));
            }
        }
        
        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(PaaSRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (PaaSRequirement.canInstantiate(elt)) {
                this._element.setPaasRequirement(PaaSRequirement.safeInstantiate(elt));
            }
        }
        
        
        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(LocationRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (LocationRequirement.canInstantiate(elt)) {
                this._element.setLocationRequirement(LocationRequirement.safeInstantiate(elt));
            }
        }
        
        
        else if(this._currentRow == 4){
            Class elt = (Class) getModelElt(ProviderRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (ProviderRequirement.canInstantiate(elt)) {
                this._element.setProviderRequirement(ProviderRequirement.safeInstantiate(elt));
            }
        }
        
        
        else if(this._currentRow == 5){
            Class elt = (Class) getModelElt(VerticalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (VerticalScaleRequirement.canInstantiate(elt)) {
                this._element.setVerticalScaleRequirement(VerticalScaleRequirement.safeInstantiate(elt));
            }
        }
        
        else if(this._currentRow == 6){
            Class elt = (Class) getModelElt(HorizontalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (HorizontalScaleRequirement.canInstantiate(elt)) {
                this._element.setHorizontalScaleRequirement(HorizontalScaleRequirement.safeInstantiate(elt));
            }
        }
        
        else if(this._currentRow == 7){
            Class elt = (Class) getModelElt(SecurityRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (SecurityRequirement.canInstantiate(elt)) {
                this._element.setSecurityRequirement(SecurityRequirement.safeInstantiate(elt));
            }
        }
        
        else if(this._currentRow == 8){
            Class elt = (Class) getModelElt(OSRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (OSRequirement.canInstantiate(elt)) {
                this._element.setOsRequirement(OSRequirement.safeInstantiate(elt));
            }
        }
        
        else if(this._currentRow == 9){
            Enumeration elt = (Enumeration) getModelElt(ImageRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (ImageRequirement.canInstantiate(elt)) {
                this._element.setImageRequirement(ImageRequirement.safeInstantiate(elt));
            }
        }
        
        this._currentRow -= 9;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("e390ae2f-da90-49fa-ac05-41011608328a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Resource Requirement
               table.addProperty("Resource Requirement", getCamelName(this._element.getResourceRequirement()), getCamelNames(ResourceRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //PaaS Requirement
        table.addProperty("PaaS Requirement", getCamelName(this._element.getPaasRequirement()), getCamelNames(PaaSRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //Location Requirement
        table.addProperty("Location Requirement", getCamelName(this._element.getLocationRequirement()), getCamelNames(LocationRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //Provider Requirement
        table.addProperty("Provider Requirement", getCamelName(this._element.getProviderRequirement()), getCamelNames(ProviderRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //Vertical Requirement
        table.addProperty("Vertical Requirement", getCamelName(this._element.getVerticalScaleRequirement()), getCamelNames(VerticalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //Horizontal Requirement
        table.addProperty("Horizontal Requirement", getCamelName(this._element.getHorizontalScaleRequirement()), getCamelNames(HorizontalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //Security Requirement
        table.addProperty("Security Requirement", getCamelName(this._element.getSecurityRequirement()), getCamelNames(SecurityRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //OS Requirement
        table.addProperty("OS Requirement", getCamelName(this._element.getOsRequirement()), getCamelNames(OSRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //Image Requirement
        table.addProperty("Image Requirement", getCamelName(this._element.getImageRequirement()), getCamelNames(ImageRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
    }

    @objid ("24def154-1341-4296-8782-a1c01e629a60")
    public RequirementSetPropertyPage(T elt) {
        super(elt);
    }

}
