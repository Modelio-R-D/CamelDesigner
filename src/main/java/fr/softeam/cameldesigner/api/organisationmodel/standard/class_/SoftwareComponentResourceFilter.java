/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
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
    @objid ("8f5e0efb-987f-404b-ae14-762cac564ef3")
    public static final String STEREOTYPE_NAME = "SoftwareComponentResourceFilter";

    @objid ("74b66e2a-ee87-4013-a318-96f4c54da50b")
    public static final String EVERYCOMPONENT_TAGTYPE = "everyComponent";

    /**
     * Tells whether a {@link SoftwareComponentResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SoftwareComponentResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1e518874-9426-4539-9a2a-ea85ef56db15")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SoftwareComponentResourceFilter >> then instantiate a {@link SoftwareComponentResourceFilter} proxy.
     * 
     * @return a {@link SoftwareComponentResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("6f36ce24-b57d-4d6a-830b-f1e334097788")
    public static SoftwareComponentResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentResourceFilter.STEREOTYPE_NAME);
        return SoftwareComponentResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentResourceFilter} proxy from a {@link Class} stereotyped << SoftwareComponentResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SoftwareComponentResourceFilter} proxy or <i>null</i>.
     */
    @objid ("c83798f1-be17-4b98-bfcd-4b6c5b6400ac")
    public static SoftwareComponentResourceFilter instantiate(final Class obj) {
        return SoftwareComponentResourceFilter.canInstantiate(obj) ? new SoftwareComponentResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentResourceFilter} proxy from a {@link Class} stereotyped << SoftwareComponentResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SoftwareComponentResourceFilter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("22d2aad5-69ae-47c4-9dd0-122966d9f266")
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
     * 
     */
    @objid ("05863af7-db31-472c-af64-8b3815a61bc1")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP);
            d.setName("softwareComponents");
            d.putTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponents");
        }
    }

    @objid ("2833461f-7257-4189-ae41-48d8205ed8a1")
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
     * 
     */
    @objid ("928aa828-3527-4cc3-8a7a-bd173e826f60")
    public CamelModel getApplication() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "application")){
                  if (CamelModel.canInstantiate(d.getDependsOn()))
                     return (CamelModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("03908897-f4fd-491e-b729-bdbc83b9d4db")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'everyComponent'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d5d5206f-0a0a-47e0-9910-72dcbb6fb96f")
    public String getEveryComponent() {
        return this.elt.getTagValue(SoftwareComponentResourceFilter.MdaTypes.EVERYCOMPONENT_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3340e8f8-364b-495f-8b9d-6796b5dd1d0d")
    public List<SoftwareComponent> getSoftwareComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponentResourceFilter.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponents")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
              if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("30726fde-de13-438c-a1ed-3e5c3a3a3235")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8beb17c9-16cc-46e3-8136-d64cd8536ae9")
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
     * 
     */
    @objid ("39b630cd-9e68-49f2-846f-2baef466707d")
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
    @objid ("536bbd13-e1d9-4062-aebd-7ae2f58d6bf5")
    public void setEveryComponent(final String value) {
        this.elt.putTagValue(SoftwareComponentResourceFilter.MdaTypes.EVERYCOMPONENT_TAGTYPE_ELT, value);
    }

    @objid ("8c004877-96e9-479c-889b-9eb7a9e610c0")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("f88d47da-e89c-4a33-92d5-7c106947779a")
    protected SoftwareComponentResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("9797b51a-6b94-4caf-a495-9d34ae7b4370")
    public static final class MdaTypes {
        @objid ("31d2106a-bbe9-46e9-be05-e1eba3c61af0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f12fd4f7-fe30-4274-bee2-d8323d80d469")
        public static TagType EVERYCOMPONENT_TAGTYPE_ELT;

        @objid ("a5bd31a4-00d7-4bb8-b3c3-eb2d105df91b")
        private static Stereotype MDAASSOCDEP;

        @objid ("971eccfe-365a-48fa-a8f9-b9ac035a3a01")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("99013495-69e9-4761-bd3c-c84f01f08d53")
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
