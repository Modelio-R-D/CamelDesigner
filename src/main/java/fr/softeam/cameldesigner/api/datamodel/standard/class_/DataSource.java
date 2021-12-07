/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
 * Proxy class to handle a {@link Class} with << DataSource >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1f333d16-724c-4e8d-a1b3-e82caab2b1f4")
public class DataSource extends FeatureClass {
    @objid ("14017071-55b7-4e3b-b5af-361247a9b694")
    public static final String STEREOTYPE_NAME = "DataSource";

    @objid ("f23436cf-a214-441f-bdd1-dbff91f77bd6")
    public static final String EXTERNAL_TAGTYPE = "external";

    /**
     * Tells whether a {@link DataSource proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataSource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8451e3dc-59f3-4dd9-b6c1-36008deb8a4f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataSource >> then instantiate a {@link DataSource} proxy.
     * 
     * @return a {@link DataSource} proxy on the created {@link Class}.
     */
    @objid ("aa045c8e-63fb-44bb-adf6-b0d778c9137f")
    public static DataSource create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataSource.STEREOTYPE_NAME);
        return DataSource.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DataSource} proxy from a {@link Class} stereotyped << DataSource >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link DataSource} proxy or <i>null</i>.
     */
    @objid ("4253af4a-3aa0-4e52-87ad-00a3401910bd")
    public static DataSource instantiate(final Class obj) {
        return DataSource.canInstantiate(obj) ? new DataSource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataSource} proxy from a {@link Class} stereotyped << DataSource >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link DataSource} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e20407ee-b1c0-4647-88d8-37424ac829bb")
    public static DataSource safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DataSource.canInstantiate(obj))
            return new DataSource(obj);
        else
            throw new IllegalArgumentException("DataSource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6d936cbd-cb3a-49e6-828f-1f2466877540")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("58f1fad2-75b8-4415-9b88-9de232ebf33a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'external'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9e6d7d1f-63b4-4783-b81a-a39f7f5bb26f")
    public String getExternal() {
        return this.elt.getTagValue(DataSource.MdaTypes.EXTERNAL_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'SoftwareComponent' role.<p>
     * Role description:
     * null
     */
    @objid ("4bfe79d4-dcda-4cfc-ab54-0862988bb87d")
    public SoftwareComponent getSoftwareComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataSource.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataSource.MdaTypes.MDAASSOCDEP_ROLE), "SoftwareComponent")
                  && SoftwareComponent.canInstantiate(d.getDependsOn())) {
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("96387973-6ca3-4c0f-aa4e-621a73986e2f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'external'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("03dfca45-93f0-4c07-b50a-e1b380e9b8aa")
    public void setExternal(final String value) {
        this.elt.putTagValue(DataSource.MdaTypes.EXTERNAL_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'SoftwareComponent' role.<p>
     * Role description:
     * null
     */
    @objid ("611c3655-af0d-4809-97dc-deafa058b315")
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

    @objid ("0efc2f6d-6929-4215-b029-4142938226fc")
    protected DataSource(final Class elt) {
        super(elt);
    }

    @objid ("a70d5efb-a707-47d2-9505-b57f05717b88")
    public static final class MdaTypes {
        @objid ("8186a40b-7a78-428e-80fa-9a1af87d22ce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e37d072-a31a-4447-9d6a-4052eed08512")
        public static TagType EXTERNAL_TAGTYPE_ELT;

        @objid ("7f5131cd-ae0a-400d-82ac-fdefef7d8987")
        private static Stereotype MDAASSOCDEP;

        @objid ("29bb42d9-cad3-4a7d-9e1f-d1c8a20b0689")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("884e7c0b-d0f6-4d0c-9c6f-552208b66a16")
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
