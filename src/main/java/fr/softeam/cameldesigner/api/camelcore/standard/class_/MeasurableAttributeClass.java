/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Class} with << MeasurableAttribute_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f7605dc5-004d-4e28-b490-e312ea63cee2")
public class MeasurableAttributeClass extends QualityAttributeClass {
    @objid ("d38e3f1f-c8a3-48c2-9623-0c128469f4d9")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute_Class";

    /**
     * Tells whether a {@link MeasurableAttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MeasurableAttribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d8c9d268-d8a3-45f1-92d7-c3a654bbc581")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MeasurableAttribute_Class >> then instantiate a {@link MeasurableAttributeClass} proxy.
     * 
     * @return a {@link MeasurableAttributeClass} proxy on the created {@link Class}.
     */
    @objid ("d3c13431-aa37-42c1-8635-90f724f3a073")
    public static MeasurableAttributeClass create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeClass.STEREOTYPE_NAME);
        return MeasurableAttributeClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MeasurableAttributeClass} proxy from a {@link Class} stereotyped << MeasurableAttribute_Class >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link MeasurableAttributeClass} proxy or <i>null</i>.
     */
    @objid ("9123063e-2b6b-42f3-aff8-3da5da8407b2")
    public static MeasurableAttributeClass instantiate(final Class obj) {
        return MeasurableAttributeClass.canInstantiate(obj) ? new MeasurableAttributeClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MeasurableAttributeClass} proxy from a {@link Class} stereotyped << MeasurableAttribute_Class >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link MeasurableAttributeClass} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1773b725-3c4f-47d0-916d-f9db8882e7ae")
    public static MeasurableAttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MeasurableAttributeClass.canInstantiate(obj))
            return new MeasurableAttributeClass(obj);
        else
            throw new IllegalArgumentException("MeasurableAttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'sensors' role.<p>
     * Role description:
     * null
     */
    @objid ("5905fc62-3ce4-48c9-aa05-1921f6fa198f")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttributeClass.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttributeClass.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("7a3c8445-0e96-4a35-b65c-94e50927a35a")
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
        MeasurableAttributeClass other = (MeasurableAttributeClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f6c3f506-4edd-42c6-87ce-f06275b39e86")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'sensors' role.<p>
     * Role description:
     * null
     */
    @objid ("4d074097-10b6-4e69-a730-3e1e5b565ff5")
    public List<Sensor> getSensors() {
        List<Sensor> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(MeasurableAttributeClass.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MeasurableAttributeClass.MdaTypes.MDAASSOCDEP_ROLE), "sensors")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("da77be7b-e908-48f3-a128-fc33647260fe")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'sensors' role.<p>
     * Role description:
     * null
     */
    @objid ("43e760a4-16c8-40ec-a7a2-221adeb0e95d")
    public boolean removeSensors(final Sensor obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MeasurableAttributeClass.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MeasurableAttributeClass.MdaTypes.MDAASSOCDEP_ROLE), "sensors")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("ebccdf04-3ddb-4eb4-8a44-023e98575a9b")
    protected MeasurableAttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("f5778737-9189-4851-90e5-4c429752bc4a")
    public static final class MdaTypes {
        @objid ("38bf6882-9559-43ca-b109-cff80f66dd78")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f835f211-54b5-495e-8798-a40856be387e")
        private static Stereotype MDAASSOCDEP;

        @objid ("ca679b82-8c4f-4a6a-a28c-add49ecea8f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2520e51a-c53d-4cde-9916-9e755b33df32")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "41f442d8-cf5f-4e6c-a842-47675cf36361");
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
