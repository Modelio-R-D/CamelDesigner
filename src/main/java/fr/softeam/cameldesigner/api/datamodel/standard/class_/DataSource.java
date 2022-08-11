/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("6182a89b-d90b-4028-93a5-8e4c6946580a")
    public static final String STEREOTYPE_NAME = "DataSource";

    @objid ("573132ba-987a-4d8d-a9c1-3126592725ec")
    public static final String EXTERNAL_TAGTYPE = "external";

    /**
     * Tells whether a {@link DataSource proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataSource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2ebcb1e4-86a5-4ec4-a3b8-1b1b5de1af00")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataSource >> then instantiate a {@link DataSource} proxy.
     * 
     * @return a {@link DataSource} proxy on the created {@link Class}.
     */
    @objid ("8caa6c2f-5e80-473f-84d9-1e457f473a64")
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
    @objid ("f3962a08-5ab3-4c26-a613-c48d4aefa179")
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
    @objid ("a5aeca1d-8210-41d9-b54f-e09ac5da267f")
    public static DataSource safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DataSource.canInstantiate(obj))
            return new DataSource(obj);
        else
            throw new IllegalArgumentException("DataSource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a2a3ca7e-9775-40a4-bca4-0bd818fb8f73")
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
    @objid ("5d6cbc8f-8970-4ec7-80e1-2e1c74c074a1")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'SoftwareComponent' role.<p>
     * Role description:
     * null
     */
    @objid ("a9b317ce-0e43-44cc-8e38-9c02559573e6")
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

    @objid ("e489da97-87f8-4e67-b43c-ef652f3445f6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'external'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5a2442a4-bc30-4dc7-868f-28f058c1e3c8")
    public boolean isExternal() {
        return this.elt.isTagged(DataSource.MdaTypes.EXTERNAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'external'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8102678d-4e84-413e-86dd-1eade0cde629")
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
     */
    @objid ("dfb73994-b984-4192-9057-190b222c3344")
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

    @objid ("82301661-6cdd-4919-a130-467903fc597f")
    protected DataSource(final Class elt) {
        super(elt);
    }

    @objid ("a70d5efb-a707-47d2-9505-b57f05717b88")
    public static final class MdaTypes {
        @objid ("e4e7b4d2-54b0-49d8-bc64-e519c3b75b53")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cfc71ad7-f1b6-4a92-9d2f-74336f3ebd91")
        public static TagType EXTERNAL_TAGTYPE_ELT;

        @objid ("928b3d0e-39f8-4af3-b622-b3a2293ffa67")
        private static Stereotype MDAASSOCDEP;

        @objid ("b6f63656-3cc6-46aa-b3c4-6723fda4d580")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ad78ef5b-fce1-4f71-afba-ceb19b6a7960")
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
