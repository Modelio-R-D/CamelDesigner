/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
    @objid ("6f13e517-a6a2-4b5f-944a-7c85efa1b3dc")
    public static final String STEREOTYPE_NAME = "RequirementSet";

    /**
     * Tells whether a {@link RequirementSet proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementSet >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8484994c-1cb3-4189-b99a-94fecff7462a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementSet.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementSet >> then instantiate a {@link RequirementSet} proxy.
     * 
     * @return a {@link RequirementSet} proxy on the created {@link Class}.
     */
    @objid ("d39cf87b-fad3-452e-8795-33d8bf41edf7")
    public static RequirementSet create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RequirementSet.STEREOTYPE_NAME);
        return RequirementSet.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RequirementSet} proxy from a {@link Class} stereotyped << RequirementSet >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link RequirementSet} proxy or <i>null</i>.
     */
    @objid ("503080e9-6402-4da6-b45a-20af493765f4")
    public static RequirementSet instantiate(final Class obj) {
        return RequirementSet.canInstantiate(obj) ? new RequirementSet(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementSet} proxy from a {@link Class} stereotyped << RequirementSet >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link RequirementSet} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("921424a2-aa5d-4703-9524-fd4cbe85b760")
    public static RequirementSet safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequirementSet.canInstantiate(obj))
            return new RequirementSet(obj);
        else
            throw new IllegalArgumentException("RequirementSet: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("120843c7-8b6c-435a-b222-f2a75bf37829")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("741b9d81-67f6-4457-bd1b-8fa354ddc5c4")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'horizontalScaleRequirement' role.<p>
     * Role description:
     * null
     */
    @objid ("873fd27c-0abe-446e-9bf4-5ead24f4a1eb")
    public HorizontalScaleRequirement getHorizontalScaleRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "horizontalScaleRequirement")
                  && HorizontalScaleRequirement.canInstantiate(d.getDependsOn())) {
                     return (HorizontalScaleRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HorizontalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'imageRequirement' role.<p>
     * Role description:
     * null
     */
    @objid ("aa0318ce-9c7a-427d-8abd-932175f45835")
    public ImageRequirement getImageRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "imageRequirement")
                  && ImageRequirement.canInstantiate(d.getDependsOn())) {
                     return (ImageRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ImageRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'locationRequirement' role.<p>
     * Role description:
     * null
     */
    @objid ("33329c9c-b1e0-406b-935f-fbe8c62cb653")
    public LocationRequirement getLocationRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "locationRequirement")
                  && LocationRequirement.canInstantiate(d.getDependsOn())) {
                     return (LocationRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LocationRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'osRequirement' role.<p>
     * Role description:
     * null
     */
    @objid ("ed77fd15-591b-4786-842a-78d0d86cb072")
    public OSRequirement getOsRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "osRequirement")
                  && OSRequirement.canInstantiate(d.getDependsOn())) {
                     return (OSRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), OSRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'paasRequirement' role.<p>
     * Role description:
     * null
     */
    @objid ("64961142-6abd-4120-9a0e-2393172888d7")
    public PaaSRequirement getPaasRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "paasRequirement")
                  && PaaSRequirement.canInstantiate(d.getDependsOn())) {
                     return (PaaSRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'providerRequirement' role.<p>
     * Role description:
     * null
     */
    @objid ("c789c7ca-c4fd-4e1d-8034-ff56ca54dcec")
    public ProviderRequirement getProviderRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "providerRequirement")
                  && ProviderRequirement.canInstantiate(d.getDependsOn())) {
                     return (ProviderRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ProviderRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'resourceRequirement' role.<p>
     * Role description:
     * null
     */
    @objid ("8228646c-cafe-407d-9e06-15ca60d5ebed")
    public ResourceRequirement getResourceRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "resourceRequirement")
                  && ResourceRequirement.canInstantiate(d.getDependsOn())) {
                     return (ResourceRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ResourceRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'securityRequirement' role.<p>
     * Role description:
     * null
     */
    @objid ("6a6748df-d704-456a-8449-f164f298bae2")
    public SecurityRequirement getSecurityRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "securityRequirement")
                  && SecurityRequirement.canInstantiate(d.getDependsOn())) {
                     return (SecurityRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'verticalScaleRequirement' role.<p>
     * Role description:
     * null
     */
    @objid ("3ff5a4e0-6c56-43f3-817f-790948656872")
    public VerticalScaleRequirement getVerticalScaleRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "verticalScaleRequirement")
                  && VerticalScaleRequirement.canInstantiate(d.getDependsOn())) {
                     return (VerticalScaleRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VerticalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("f7256b8d-6b99-4e09-aec8-82a9dad735d7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'horizontalScaleRequirement' role.<p>
     * Role description:
     * null
     */
    @objid ("12fdc761-c3aa-433d-9a31-a3b41d755eb0")
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
     */
    @objid ("1560108a-20e5-40ad-9c15-9d7f0d2776fa")
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
     */
    @objid ("800473ce-43ef-40c1-84c0-2cd18c57250a")
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
     */
    @objid ("25975f59-af54-4b14-b8de-5aa9782a84f5")
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
     */
    @objid ("a14fbc4c-bc08-42aa-b0f8-e8b8fffbc4d5")
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
     */
    @objid ("811acde2-dbae-4459-b9fc-b9fa779ff6ba")
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
     */
    @objid ("2aa4073f-9506-419e-b095-fb5ca230b2c7")
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
     */
    @objid ("31c2d7dd-a834-47cc-8a6f-7815260fcc0f")
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
     */
    @objid ("0b0c094b-15b2-4d9c-867d-0913c5707072")
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

    @objid ("139873ce-348b-458d-a16a-6f4047cffaf2")
    protected RequirementSet(final Class elt) {
        super(elt);
    }

    @objid ("56f9723e-57a0-4b68-946b-a3f85b1617ce")
    public static final class MdaTypes {
        @objid ("b0947371-18c8-4453-93e6-7946610e7ccc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("232c27de-4e71-4ee7-8416-25717865fda2")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd11cc67-4fc8-4c3f-a956-adb68176e8ef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7c96b1c6-6c80-4d85-95cc-a88def63aafa")
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
