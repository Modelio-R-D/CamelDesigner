/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("eeeb3c04-5d47-46d0-821b-c9b3ebc70913")
    public static final String STEREOTYPE_NAME = "RequirementSet";

    /**
     * Tells whether a {@link RequirementSet proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementSet >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1792b96d-1dd5-4688-b444-0ea67978574f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementSet.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementSet >> then instantiate a {@link RequirementSet} proxy.
     * 
     * @return a {@link RequirementSet} proxy on the created {@link Class}.
     */
    @objid ("09b97a8b-6e53-4f42-a9f9-77bf9dc90c1e")
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
    @objid ("4c0f3f96-a4f7-4d8e-a40e-787e4e227b7a")
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
    @objid ("5785aa24-47ac-4ca2-8d26-985de9bf194d")
    public static RequirementSet safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequirementSet.canInstantiate(obj))
        	return new RequirementSet(obj);
        else
        	throw new IllegalArgumentException("RequirementSet: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fc722009-46a4-4859-8324-85036fa0eb5c")
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
    @objid ("2b574793-ffce-4f43-8969-e988f7cc1368")
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
    @objid ("5656ed48-e6c0-4903-990d-df63fead5fea")
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
    @objid ("663cbbf6-c958-44d0-a60f-d17579e1075f")
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
    @objid ("e1949e5a-198e-400a-98a5-5f9a58e019d5")
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
    @objid ("988a8b13-db20-443a-aba4-942a14cb0dee")
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
    @objid ("ead096e0-b87e-4347-834e-28c3195a7e0e")
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
    @objid ("b3621f92-eace-462d-aff6-b6bb1d7a3e29")
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
    @objid ("97e14429-bdf7-4bce-af37-cd8f54b44fcf")
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
    @objid ("3bb3b768-08b4-4dc7-8d59-3eee0d45c3d7")
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
    @objid ("80ecc1f2-fb3b-41c6-8c53-015337043924")
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

    @objid ("5ef10910-18b7-498b-ade3-80df722a64af")
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
    @objid ("370d4927-e90c-43a0-b774-ef54af7ebe8a")
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
    @objid ("4a27ddc3-1102-4a56-a304-c61b79989427")
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
    @objid ("c9a8825c-0c77-4462-9c32-43ff904da289")
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
    @objid ("58723d3c-9dcb-4e64-af67-b91dd324fd04")
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
    @objid ("13c2b405-b1fe-4ff7-9c73-30400c03eec6")
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
    @objid ("836f80ae-2cc5-4b55-a74c-684c669488ac")
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
    @objid ("eab4ab5b-feee-4b51-aa99-b9fb5be807a1")
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
    @objid ("e7f32f10-87a5-4487-bf4c-e96306431805")
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
    @objid ("106c271c-fa14-497e-86b3-ded5f176586b")
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

    @objid ("c9dc530a-4a2f-42e5-8c85-5e02848ef635")
    protected RequirementSet(final Class elt) {
        super(elt);
    }

    @objid ("56f9723e-57a0-4b68-946b-a3f85b1617ce")
    public static final class MdaTypes {
        @objid ("d096920a-60d0-4671-87c2-22d3730485f4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("57613aff-752a-45de-810f-eed2c2d50d7f")
        private static Stereotype MDAASSOCDEP;

        @objid ("8da992ed-8dbd-4218-be42-65b4125e8939")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e1e9591e-5236-4805-8a2c-dc7947c9866a")
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
