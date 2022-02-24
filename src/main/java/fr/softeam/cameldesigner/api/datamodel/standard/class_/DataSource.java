/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("515a7bde-9891-47f1-9daf-870b07264ed0")
    public static final String STEREOTYPE_NAME = "DataSource";

    @objid ("04a24a86-0b1d-4213-9b81-33ee313e9b16")
    public static final String EXTERNAL_TAGTYPE = "external";

    /**
     * Tells whether a {@link DataSource proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataSource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c377a1fd-2a57-4440-bdd1-c2112a4f414e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataSource >> then instantiate a {@link DataSource} proxy.
     * 
     * @return a {@link DataSource} proxy on the created {@link Class}.
     */
    @objid ("a832b009-9294-4dc8-99ee-aed4d74715f5")
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
    @objid ("c07227e6-7c90-43d9-a04e-85d2944ae21a")
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
    @objid ("93e3a03f-f999-440d-b369-8cbd9449a0d0")
    public static DataSource safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DataSource.canInstantiate(obj))
        	return new DataSource(obj);
        else
        	throw new IllegalArgumentException("DataSource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("919c4aa9-1cb3-46d8-9c72-a21853ec5499")
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
    @objid ("5aec9f67-2e84-4de5-8712-dbde7e0aa3c6")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'external'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("51081dc3-f751-4c83-ae95-b6e18d7f4d21")
    public String getExternal() {
        return this.elt.getTagValue(DataSource.MdaTypes.EXTERNAL_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'SoftwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("26a7a8f6-9a1b-4588-93e6-3f917ea74f52")
    public SoftwareComponent getSoftwareComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataSource.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataSource.MdaTypes.MDAASSOCDEP_ROLE), "SoftwareComponent")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("8c7a1e5f-9375-44b6-bc11-d1e19f8d328d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'external'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2b553644-8fb5-4848-838d-26ab67be429c")
    public void setExternal(final String value) {
        this.elt.putTagValue(DataSource.MdaTypes.EXTERNAL_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'SoftwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d1fda8be-7b5d-40af-9844-9aac38655a88")
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

    @objid ("d2c78c09-c307-42cd-be62-4da911a27a58")
    protected DataSource(final Class elt) {
        super(elt);
    }

    @objid ("a70d5efb-a707-47d2-9505-b57f05717b88")
    public static final class MdaTypes {
        @objid ("f681bdd5-3afd-4efe-bb23-920a625ba763")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("43a6b914-11bb-4f6f-9da2-e24d0bf14a94")
        public static TagType EXTERNAL_TAGTYPE_ELT;

        @objid ("d22c54de-23ef-4119-a06d-e22a1b59d286")
        private static Stereotype MDAASSOCDEP;

        @objid ("b6c7ae90-5cb3-4e61-a783-819a3410bfc4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c8895cec-dea4-43c0-8d61-068e856fa8fd")
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
