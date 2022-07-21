/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << RequirementSet >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e40108e4-3b57-462c-a46e-00c47710d45a")
public class RequirementSet extends FeatureClass {
    @objid ("dd8d1a86-bedd-4432-9aab-f5eeb4c182aa")
    public static final String STEREOTYPE_NAME = "RequirementSet";

    /**
     * Tells whether a {@link RequirementSet proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementSet >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fb2447f0-99bd-4f9c-b60f-86dd4ce806e2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementSet.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementSet >> then instantiate a {@link RequirementSet} proxy.
     * 
     * @return a {@link RequirementSet} proxy on the created {@link Class}.
     */
    @objid ("d8f499e1-cd19-494d-9280-18fa2d0a3ead")
    public static RequirementSet create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RequirementSet.STEREOTYPE_NAME);
        return RequirementSet.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RequirementSet} proxy from a {@link Class} stereotyped << RequirementSet >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RequirementSet} proxy or <i>null</i>.
     */
    @objid ("61dae0b5-5eb5-46b9-a5ec-fd9032424f74")
    public static RequirementSet instantiate(final Class obj) {
        return RequirementSet.canInstantiate(obj) ? new RequirementSet(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementSet} proxy from a {@link Class} stereotyped << RequirementSet >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RequirementSet} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6ac4cd54-25a7-4160-90f0-efe8278d93f5")
    public static RequirementSet safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequirementSet.canInstantiate(obj))
        	return new RequirementSet(obj);
        else
        	throw new IllegalArgumentException("RequirementSet: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("55e4c77e-df20-475b-a3ad-7bdffadcd9c2")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        RequirementSet other = (RequirementSet) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e62df07e-db62-4c5d-b716-426e20f3dc05")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'horizontalScaleRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a8f980e2-34e9-413b-8d45-d23e8887288e")
    public HorizontalScaleRequirement getHorizontalScaleRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "horizontalScaleRequirement")){
                  if (HorizontalScaleRequirement.canInstantiate(d.getDependsOn()))
                     return (HorizontalScaleRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HorizontalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'imageRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("33055b05-920c-4fa2-9928-e5af707c907e")
    public ImageRequirement getImageRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "imageRequirement")){
                  if (ImageRequirement.canInstantiate(d.getDependsOn()))
                     return (ImageRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ImageRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'locationRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ebbfe5f6-f314-4076-a82c-30fc56c97045")
    public LocationRequirement getLocationRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "locationRequirement")){
                  if (LocationRequirement.canInstantiate(d.getDependsOn()))
                     return (LocationRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LocationRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'osRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4c782596-d854-4cce-84f8-aab0a71a0b74")
    public OSRequirement getOsRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "osRequirement")){
                  if (OSRequirement.canInstantiate(d.getDependsOn()))
                     return (OSRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), OSRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'paasRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("efc74f35-884d-453b-ad9c-11d8e8ceee1f")
    public PaaSRequirement getPaasRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "paasRequirement")){
                  if (PaaSRequirement.canInstantiate(d.getDependsOn()))
                     return (PaaSRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'providerRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a6da99b8-9bb2-45cc-a968-b6aeee33fed3")
    public ProviderRequirement getProviderRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "providerRequirement")){
                  if (ProviderRequirement.canInstantiate(d.getDependsOn()))
                     return (ProviderRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ProviderRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'resourceRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e27289ce-2e75-400d-a425-d66a83223625")
    public ResourceRequirement getResourceRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "resourceRequirement")){
                  if (ResourceRequirement.canInstantiate(d.getDependsOn()))
                     return (ResourceRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ResourceRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'securityRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("59805670-a7c2-477d-a934-ffa664ea8818")
    public SecurityRequirement getSecurityRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "securityRequirement")){
                  if (SecurityRequirement.canInstantiate(d.getDependsOn()))
                     return (SecurityRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'verticalScaleRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("25b01f17-e1a7-4cce-ad04-916cf2b76f9e")
    public VerticalScaleRequirement getVerticalScaleRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "verticalScaleRequirement")){
                  if (VerticalScaleRequirement.canInstantiate(d.getDependsOn()))
                     return (VerticalScaleRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VerticalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("f4fcdd4d-afb1-4ebc-94a9-9b7130a22328")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'horizontalScaleRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a236c818-1f47-4ac9-84dd-d28528f68df5")
    public void setHorizontalScaleRequirement(final HorizontalScaleRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "horizontalScaleRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("horizontalScaleRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "horizontalScaleRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'imageRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6b673897-7fde-4861-b85d-21c953cb17ac")
    public void setImageRequirement(final ImageRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "imageRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("imageRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "imageRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'locationRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("df03ade2-d854-4ba8-a8a9-a3dfd36c5ef1")
    public void setLocationRequirement(final LocationRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "locationRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("locationRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "locationRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'osRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4ad2a2e9-2af8-4a99-971a-9ec862e4aa1a")
    public void setOsRequirement(final OSRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "osRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("osRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "osRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'paasRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b194ea27-3c30-473c-a4c2-5c67762e4a6b")
    public void setPaasRequirement(final PaaSRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "paasRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("paasRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "paasRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'providerRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("474f1370-0d07-43a2-8edb-5cbc6ea5370f")
    public void setProviderRequirement(final ProviderRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "providerRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("providerRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "providerRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'resourceRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("50f9027d-3db5-489a-88a9-e321b43b0b48")
    public void setResourceRequirement(final ResourceRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "resourceRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("resourceRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "resourceRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'securityRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("522fce61-0618-417b-b5a9-479de6404b05")
    public void setSecurityRequirement(final SecurityRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "securityRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("securityRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "securityRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'verticalScaleRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("658f9f61-add7-40b8-badb-bfd322437cdb")
    public void setVerticalScaleRequirement(final VerticalScaleRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "verticalScaleRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("verticalScaleRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "verticalScaleRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("c471cd42-bd78-445f-af2c-eec88afdb9bd")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("80d229d4-4cb4-4ea0-b08a-41924bd0871e")
    protected RequirementSet(final Class elt) {
        super(elt);
    }

    @objid ("56f9723e-57a0-4b68-946b-a3f85b1617ce")
    public static final class MdaTypes {
        @objid ("5dc05c20-569b-49c0-8cec-9cc9f9bd5862")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("452eabf8-2b4a-4580-976e-b666b0b7d496")
        private static Stereotype MDAASSOCDEP;

        @objid ("e89eb6a1-3bd3-4498-bc78-920b2eae467e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("563b63f4-09d3-4f5f-84bc-42c2aaacbec0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "513b1519-9560-4cd7-9dd4-f071d5fe54e8");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
