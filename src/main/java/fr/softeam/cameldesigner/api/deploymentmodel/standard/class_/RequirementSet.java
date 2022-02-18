/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("70d90665-8a94-40f2-8c38-3aaea2b1b249")
    public static final String STEREOTYPE_NAME = "RequirementSet";

    /**
     * Tells whether a {@link RequirementSet proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementSet >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dd0092cb-ba0f-420a-ad0b-bbe266de2a38")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementSet.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementSet >> then instantiate a {@link RequirementSet} proxy.
     * 
     * @return a {@link RequirementSet} proxy on the created {@link Class}.
     */
    @objid ("94b58576-9258-42cb-b983-95ed36aa019e")
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
    @objid ("1193cabe-66ea-492e-a8df-6b36a65dc970")
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
    @objid ("8b3ca336-365a-4044-b1ef-064130465d71")
    public static RequirementSet safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequirementSet.canInstantiate(obj))
        	return new RequirementSet(obj);
        else
        	throw new IllegalArgumentException("RequirementSet: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cdf7cc98-842d-4f98-a9d0-351c1a45c7e7")
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
    @objid ("4f22f4d1-7cb6-43b6-896d-6996d4f9b80e")
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
    @objid ("cb161931-39ce-4dbd-9053-7a12ecdcf44b")
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
    @objid ("05812449-f86f-4a95-b0b0-6b6f7b74874f")
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
    @objid ("a4901b04-1506-48ce-ad8d-d91da90c33f1")
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
    @objid ("770a8c20-e9fc-43ad-8fe4-057f173ed5b6")
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
    @objid ("884555ee-3de3-452c-975c-bfef24bc7be8")
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
    @objid ("36e8253b-e722-438b-aaa6-8c4135a9f283")
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
    @objid ("b9f03df5-5ecd-493f-bc98-d53f26980806")
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
    @objid ("d66a4382-d69e-4d56-8390-77becd3a7cab")
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
    @objid ("e5061cb4-d1c9-4049-8c11-184ff4c4d6cf")
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

    @objid ("6388006c-489b-4ec0-82f1-ce53a3e9cc86")
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
    @objid ("e27fd3b8-6c8e-4825-89df-0466b9afd470")
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
    @objid ("a02cc1af-dbed-42d4-85dd-22bcc7be8671")
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
    @objid ("0a98af40-49c7-4bbb-abec-a727c48d43b9")
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
    @objid ("2a7784bf-1d98-4ef3-ab7f-3d90ff01cf8c")
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
    @objid ("6eada2fe-47ec-4da3-8eff-d933c813534e")
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
    @objid ("45e39d5e-3654-47bc-9411-54257b253718")
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
    @objid ("b0900dc6-b33f-4157-90b4-89d140032740")
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
    @objid ("5d5a95d0-80ad-4ea1-ae1c-9e84164b302f")
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
    @objid ("cba3a27c-91cf-453b-a84d-75eeff84e8a4")
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

    @objid ("ea5e1b4c-3ba2-48bc-8f50-aaf0e138eb29")
    protected RequirementSet(final Class elt) {
        super(elt);
    }

    @objid ("56f9723e-57a0-4b68-946b-a3f85b1617ce")
    public static final class MdaTypes {
        @objid ("3464d242-2bab-4abd-b17e-0107b5971b0f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2911be9a-68dc-400e-841a-40524c76e3ca")
        private static Stereotype MDAASSOCDEP;

        @objid ("7c093c39-7f65-407d-a508-6e0c534f6134")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("22f7e6d5-071c-4e54-9a0d-f867335ea5f7")
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
