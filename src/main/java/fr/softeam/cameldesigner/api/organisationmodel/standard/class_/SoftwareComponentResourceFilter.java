/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
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
 * Proxy class to handle a {@link Class} with << SoftwareComponentResourceFilter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("729d862a-a2e3-4f6e-ae37-85020c924c77")
public class SoftwareComponentResourceFilter extends ResourceFilter {
    @objid ("954f3316-180a-4b12-80cd-02cb989abf2e")
    public static final String STEREOTYPE_NAME = "SoftwareComponentResourceFilter";

    @objid ("fb2f8947-443e-48d6-821c-0ca4e7d8e188")
    public static final String EVERYCOMPONENT_TAGTYPE = "everyComponent";

    /**
     * Tells whether a {@link SoftwareComponentResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SoftwareComponentResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7c105726-eb57-4044-afca-96b75488d3c4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SoftwareComponentResourceFilter >> then instantiate a {@link SoftwareComponentResourceFilter} proxy.
     * 
     * @return a {@link SoftwareComponentResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("cee4cc43-6385-4294-9534-5f3ffdaca892")
    public static SoftwareComponentResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentResourceFilter.STEREOTYPE_NAME);
        return SoftwareComponentResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentResourceFilter} proxy from a {@link Class} stereotyped << SoftwareComponentResourceFilter >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link SoftwareComponentResourceFilter} proxy or <i>null</i>.
     */
    @objid ("0cc434e6-9386-46be-9f90-a5187326addd")
    public static SoftwareComponentResourceFilter instantiate(final Class obj) {
        return SoftwareComponentResourceFilter.canInstantiate(obj) ? new SoftwareComponentResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentResourceFilter} proxy from a {@link Class} stereotyped << SoftwareComponentResourceFilter >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link SoftwareComponentResourceFilter} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dc4d1a0c-7d2c-4a38-a51c-7f5660e0421c")
    public static SoftwareComponentResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SoftwareComponentResourceFilter.canInstantiate(obj))
            return new SoftwareComponentResourceFilter(obj);
        else
            throw new IllegalArgumentException("SoftwareComponentResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'softwareComponents' role.<p>
     * Role description:
     * null
     */
    @objid ("8682635f-4c95-482c-8c93-e96c556f372e")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP);
            d.setName("softwareComponents");
            d.putTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponents");
        }
    }

    @objid ("d17f9317-d92c-4387-ba2d-bd243a744224")
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
        SoftwareComponentResourceFilter other = (SoftwareComponentResourceFilter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'application' role.<p>
     * Role description:
     * null
     */
    @objid ("ca24d8fa-6e03-4019-b742-a3b09a288e41")
    public CamelModel getApplication() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "application")
                  && CamelModel.canInstantiate(d.getDependsOn())) {
                     return (CamelModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("35637951-f31a-46c0-a4f6-1d94e06dff89")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'everyComponent'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e76cd5c6-924c-407e-b2be-48ef06846749")
    public String getEveryComponent() {
        return this.elt.getTagValue(SoftwareComponentResourceFilter.MdaTypes.EVERYCOMPONENT_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'softwareComponents' role.<p>
     * Role description:
     * null
     */
    @objid ("0b3e386b-6b99-4340-902f-ef67662e83b5")
    public List<SoftwareComponent> getSoftwareComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponents")
              && SoftwareComponent.canInstantiate(d.getDependsOn()))
                results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5c2491c9-756a-46c5-addc-4397600c1f35")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     */
    @objid ("f7d51e27-4679-43fe-8e30-a1b10eba0cc6")
    public boolean removeSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'application' role.<p>
     * Role description:
     * null
     */
    @objid ("efabe4c1-adbe-454f-9bdf-4ff338b4b040")
    public void setApplication(final CamelModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "application")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP);
              dep.setName("application");      dep.putTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "application");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'everyComponent'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6221c70b-1dbb-464f-a231-e95a8a34ec19")
    public void setEveryComponent(final String value) {
        this.elt.putTagValue(SoftwareComponentResourceFilter.MdaTypes.EVERYCOMPONENT_TAGTYPE_ELT, value);
    }

    @objid ("0c56e759-9d3e-4ba2-8593-9b2267e9dc19")
    protected SoftwareComponentResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("8c004877-96e9-479c-889b-9eb7a9e610c0")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("9797b51a-6b94-4caf-a495-9d34ae7b4370")
    public static final class MdaTypes {
        @objid ("04fa1bd4-939f-4986-a7a6-c060ca59d46f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4517593f-9a26-424f-a60a-f72bdd70aeb3")
        public static TagType EVERYCOMPONENT_TAGTYPE_ELT;

        @objid ("93e84e9c-f644-4416-b1bf-fb2714e9aa13")
        private static Stereotype MDAASSOCDEP;

        @objid ("ba051047-a20a-496e-a063-c91fcbf51126")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9bdbc92a-e8fc-4e46-86de-34c846a876d5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d2a3f527-691b-4b04-a5c2-63f39b55c173");
            EVERYCOMPONENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "726ba30c-05cc-4f4b-b31a-4c9238661a62");
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
