package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Enumeration;
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

public class RequirementSetPropertyPage<T extends RequirementSet> extends FeatureClassPropertyPage<T> {

    private List<ModelElement> _resourceRequirement = null;

    private List<ModelElement> _paasRequirement = null;

    private List<ModelElement> _locationRequirement = null;

    private List<ModelElement> _providerRequirement = null;

    private List<ModelElement> _verticalRequirement = null;

    private List<ModelElement> _horizontalRequirement = null;

    private List<ModelElement> _securityRequirement = null;

    private List<ModelElement> _osRequirement = null;

    private List<ModelElement> _imageRequirement = null;

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

        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(this._resourceRequirement, value);
            if (ResourceRequirement.canInstantiate(elt)) {
                this._element.setResourceRequirement(ResourceRequirement.safeInstantiate(elt));
            }
        }

        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(this._paasRequirement, value);
            if (PaaSRequirement.canInstantiate(elt)) {
                this._element.setPaasRequirement(PaaSRequirement.safeInstantiate(elt));
            }
        }


        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(this._locationRequirement, value);
            if (LocationRequirement.canInstantiate(elt)) {
                this._element.setLocationRequirement(LocationRequirement.safeInstantiate(elt));
            }
        }


        else if(this._currentRow == 4){
            Class elt = (Class) getModelElt(this._providerRequirement, value);
            if (ProviderRequirement.canInstantiate(elt)) {
                this._element.setProviderRequirement(ProviderRequirement.safeInstantiate(elt));
            }
        }


        else if(this._currentRow == 5){
            Class elt = (Class) getModelElt(this._verticalRequirement, value);
            if (VerticalScaleRequirement.canInstantiate(elt)) {
                this._element.setVerticalScaleRequirement(VerticalScaleRequirement.safeInstantiate(elt));
            }
        }

        else if(this._currentRow == 6){
            Class elt = (Class) getModelElt(this._horizontalRequirement, value);
            if (HorizontalScaleRequirement.canInstantiate(elt)) {
                this._element.setHorizontalScaleRequirement(HorizontalScaleRequirement.safeInstantiate(elt));
            }
        }

        else if(this._currentRow == 7){
            Class elt = (Class) getModelElt(this._securityRequirement, value);
            if (SecurityRequirement.canInstantiate(elt)) {
                this._element.setSecurityRequirement(SecurityRequirement.safeInstantiate(elt));
            }
        }

        else if(this._currentRow == 8){
            Class elt = (Class) getModelElt(this._osRequirement, value);
            if (OSRequirement.canInstantiate(elt)) {
                this._element.setOsRequirement(OSRequirement.safeInstantiate(elt));
            }
        }

        else if(this._currentRow == 9){
            Enumeration elt = (Enumeration) getModelElt(this._imageRequirement, value);
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
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //Resource Requirement
        this._resourceRequirement = ResourceRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Resource Requirement", getCamelName(this._element.getResourceRequirement()), getCamelNames(this._resourceRequirement));

        //PaaS Requirement
        this._paasRequirement = PaaSRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("PaaS Requirement", getCamelName(this._element.getPaasRequirement()), getCamelNames(this._paasRequirement));

        //Location Requirement
        this._locationRequirement = LocationRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Location Requirement", getCamelName(this._element.getLocationRequirement()), getCamelNames(this._locationRequirement));

        //Provider Requirement
        this._providerRequirement = ProviderRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Provider Requirement", getCamelName(this._element.getProviderRequirement()), getCamelNames(this._providerRequirement));

        //Vertical Requirement
        this._verticalRequirement = VerticalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Vertical Requirement", getCamelName(this._element.getVerticalScaleRequirement()), getCamelNames(this._verticalRequirement));

        //Horizontal Requirement
        this._horizontalRequirement = HorizontalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Horizontal Requirement", getCamelName(this._element.getHorizontalScaleRequirement()), getCamelNames(this._horizontalRequirement));

        //Security Requirement
        this._securityRequirement = SecurityRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Security Requirement", getCamelName(this._element.getSecurityRequirement()), getCamelNames(this._securityRequirement));

        //OS Requirement
        this._osRequirement = OSRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("OS Requirement", getCamelName(this._element.getOsRequirement()), getCamelNames(this._osRequirement));

        //Image Requirement
        this._imageRequirement = ImageRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Image Requirement", getCamelName(this._element.getImageRequirement()), getCamelNames(this._imageRequirement));
    }

    public RequirementSetPropertyPage(T elt) {
        super(elt);
    }

}
