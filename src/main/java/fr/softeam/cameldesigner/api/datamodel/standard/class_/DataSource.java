/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.api.profiler.standard.component.ProfilerComponent;
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
 * Proxy class to handle a {@link Class} with << DataSource >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1f333d16-724c-4e8d-a1b3-e82caab2b1f4")
public class DataSource extends FeatureClass {
    @objid ("72349693-ebaa-4e47-938c-ca51b6679f8c")
    public static final String STEREOTYPE_NAME = "DataSource";

    @objid ("13375584-fd9a-4643-a36b-23788eb0d44e")
    public static final String EXTERNAL_TAGTYPE = "external";

    /**
     * Tells whether a {@link DataSource proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataSource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8ca84812-897a-491d-9a48-cb5758883556")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataSource >> then instantiate a {@link DataSource} proxy.
     * 
     * @return a {@link DataSource} proxy on the created {@link Class}.
     */
    @objid ("42add5da-2905-462b-9395-c5e29b2a79f4")
    public static DataSource create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataSource.STEREOTYPE_NAME);
        return DataSource.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DataSource} proxy from a {@link Class} stereotyped << DataSource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link DataSource} proxy or <i>null</i>.
     */
    @objid ("ac6ee574-9d53-4b75-9627-04dc668d5e44")
    public static DataSource instantiate(final Class obj) {
        return DataSource.canInstantiate(obj) ? new DataSource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataSource} proxy from a {@link Class} stereotyped << DataSource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link DataSource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6c4d4089-dc96-4f75-973a-3b285324cbbd")
    public static DataSource safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DataSource.canInstantiate(obj))
        	return new DataSource(obj);
        else
        	throw new IllegalArgumentException("DataSource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("35f64312-517b-47e6-88fe-1d7522e33849")
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
        DataSource other = (DataSource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("4448c8c6-b178-448e-bbc3-89974c84a6f8")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'SoftwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b22f493e-add6-4b24-9b0a-1cd386cbd29f")
    public SoftwareComponent getSoftwareComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataSource.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataSource.MdaTypes.MDAASSOCDEP_ROLE), "SoftwareComponent")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ProfilerComponent.canInstantiate(d.getDependsOn()))
                     return (ProfilerComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ProfilerComponent.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("974e00ec-cad5-4074-9130-7dea281862b6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'external'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("01ddaf5a-fd94-4439-9f17-900682661b52")
    public boolean isExternal() {
        return this.elt.isTagged(DataSource.MdaTypes.EXTERNAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'external'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("910b5d69-d3e0-4cb3-b95f-a7f897d19555")
    public void setExternal(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(DataSource.MdaTypes.EXTERNAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(DataSource.MdaTypes.EXTERNAL_TAGTYPE_ELT);
    }

    /**
     * Set the value of the 'SoftwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2732c64a-4e03-471d-b154-a899c6ed0f69")
    public void setSoftwareComponent(final SoftwareComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DataSource.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataSource.MdaTypes.MDAASSOCDEP_ROLE), "SoftwareComponent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DataSource.MdaTypes.MDAASSOCDEP);
              dep.setName("SoftwareComponent");      dep.putTagValue(DataSource.MdaTypes.MDAASSOCDEP_ROLE, "SoftwareComponent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("55fd66d7-eecf-4c3c-a327-20878ccbdcf8")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("d7551a35-bebe-42c8-8c22-5ff8c88dbb7f")
    protected DataSource(final Class elt) {
        super(elt);
    }

    @objid ("a70d5efb-a707-47d2-9505-b57f05717b88")
    public static final class MdaTypes {
        @objid ("e190471e-1cd3-40d6-8792-01443ea75139")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2239f3b3-8fba-4faf-bcd0-6c43a41c42bb")
        public static TagType EXTERNAL_TAGTYPE_ELT;

        @objid ("6f96d591-81b9-4172-9fd2-1f11f9d89e03")
        private static Stereotype MDAASSOCDEP;

        @objid ("cbd6b07f-3c73-478a-8428-1415fcae45e1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a001d6f9-b973-4fae-beff-08b836eba068")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "074f2086-e176-45fc-80c7-81fd2336ac7f");
            EXTERNAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "05736a3c-caa6-4f52-b966-63ac2100cca2");
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
