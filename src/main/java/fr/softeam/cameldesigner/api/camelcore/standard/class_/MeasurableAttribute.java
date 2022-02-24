/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << MeasurableAttribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f7605dc5-004d-4e28-b490-e312ea63cee2")
public class MeasurableAttribute extends QualityAttribute {
    @objid ("66e7c047-e269-47a9-944d-ca3d9a6d3ea6")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute";

    /**
     * Tells whether a {@link MeasurableAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MeasurableAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6f3fd78c-9f4f-4cf1-a817-d82e50b69e77")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MeasurableAttribute >> then instantiate a {@link MeasurableAttribute} proxy.
     * 
     * @return a {@link MeasurableAttribute} proxy on the created {@link Class}.
     */
    @objid ("e94ee10c-5b86-490c-a3bc-e57d28228485")
    public static MeasurableAttribute create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttribute.STEREOTYPE_NAME);
        return MeasurableAttribute.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MeasurableAttribute} proxy from a {@link Class} stereotyped << MeasurableAttribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link MeasurableAttribute} proxy or <i>null</i>.
     */
    @objid ("0ed95961-76a1-421f-84d9-069f5e8dba31")
    public static MeasurableAttribute instantiate(final Class obj) {
        return MeasurableAttribute.canInstantiate(obj) ? new MeasurableAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MeasurableAttribute} proxy from a {@link Class} stereotyped << MeasurableAttribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link MeasurableAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("676db007-8410-449e-9b23-24db3bd01e8e")
    public static MeasurableAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MeasurableAttribute.canInstantiate(obj))
        	return new MeasurableAttribute(obj);
        else
        	throw new IllegalArgumentException("MeasurableAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("099173f7-c93f-44fa-801e-304ac70b573f")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttribute.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttribute.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("f3796b8c-2ce0-483b-b9c5-acefced70ac1")
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
        MeasurableAttribute other = (MeasurableAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("89583c35-c575-456a-b1e3-e03214f9447e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("706cf0eb-da68-4acb-b980-cd37dbef450f")
    public List<Sensor> getSensors() {
        List<Sensor> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(MeasurableAttribute.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MeasurableAttribute.MdaTypes.MDAASSOCDEP_ROLE), "sensors")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("53601ec6-4180-4e87-8326-f409e009182e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8ad792fb-4c01-4c1a-be74-cf8ecb018e76")
    public boolean removeSensors(final Sensor obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MeasurableAttribute.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MeasurableAttribute.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("f6af93d9-da1e-4bec-8430-cfac17ae154e")
    protected MeasurableAttribute(final Class elt) {
        super(elt);
    }

    @objid ("f5778737-9189-4851-90e5-4c429752bc4a")
    public static final class MdaTypes {
        @objid ("17cb8afc-e6fd-4fdc-87a1-01d8028f5661")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("773b80b5-d37e-4a66-8ced-2c2af6db8b41")
        private static Stereotype MDAASSOCDEP;

        @objid ("6b18f55a-59cc-46cd-9697-d1d299588dca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("effc876c-45fa-414f-9f92-4ab483439688")
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
