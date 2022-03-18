/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link BindableInstance} with << DataInstance_BindableInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f23e6d20-b54c-47fc-848b-1b0ab1c02666")
public class DataInstanceBindableInstance extends DataInstance {
    @objid ("8902eb38-61d4-4079-85d9-729d449b443b")
    public static final String STEREOTYPE_NAME = "DataInstance_BindableInstance";

    /**
     * Tells whether a {@link DataInstanceBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << DataInstance_BindableInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("57f529fa-c8ef-4fd5-a510-2a8c0fa10db0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << DataInstance_BindableInstance >> then instantiate a {@link DataInstanceBindableInstance} proxy.
     * 
     * @return a {@link DataInstanceBindableInstance} proxy on the created {@link BindableInstance}.
     */
    @objid ("22e68126-2c96-4a8a-b551-2584ef776f06")
    public static DataInstanceBindableInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.BindableInstance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceBindableInstance.STEREOTYPE_NAME);
        return DataInstanceBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link DataInstanceBindableInstance} proxy from a {@link BindableInstance} stereotyped << DataInstance_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link DataInstanceBindableInstance} proxy or <i>null</i>.
     */
    @objid ("a66cc526-d9e4-496a-8275-a3ff48656db3")
    public static DataInstanceBindableInstance instantiate(final BindableInstance obj) {
        return DataInstanceBindableInstance.canInstantiate(obj) ? new DataInstanceBindableInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstanceBindableInstance} proxy from a {@link BindableInstance} stereotyped << DataInstance_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link BindableInstance}
     * @return a {@link DataInstanceBindableInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e784bbff-e208-449d-966e-1463ccb12e95")
    public static DataInstanceBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (DataInstanceBindableInstance.canInstantiate(obj))
        	return new DataInstanceBindableInstance(obj);
        else
        	throw new IllegalArgumentException("DataInstanceBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a5dd4f27-0f5e-4282-b011-7177b0f7d454")
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
        DataInstanceBindableInstance other = (DataInstanceBindableInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link BindableInstance}. 
     * @return the BindableInstance represented by this proxy, never null.
     */
    @objid ("d1a91106-ec62-49a7-a963-7e77aa1b5ff8")
    @Override
    public BindableInstance getElement() {
        return (BindableInstance)super.getElement();
    }

    /**
     * Get the value to the 'owner' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("228bccd7-7ccb-4921-890b-a80ac97befb9")
    public DataInstance getOwner() {
        return (DataInstance)CamelDesignerProxyFactory.instantiate(((BindableInstance) this.elt).getCluster(), DataInstance.STEREOTYPE_NAME);
    }

    @objid ("4493c5fc-f10d-4c9e-9f55-4a52bdd6321e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'owner' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d90111d1-d9bc-4d52-a4bf-f2297b7e2567")
    public void setOwner(final DataInstance obj) {
        ((BindableInstance) this.elt).setCluster((obj != null) ? obj.getElement() : null);
    }

    @objid ("261564c5-66d9-4bdb-85b2-7e8f0e8d5081")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("e1ed4490-8cec-4b2f-9c43-6b536332f445")
    protected DataInstanceBindableInstance(final BindableInstance elt) {
        super(elt);
    }

    @objid ("a85bfe4a-348a-47dc-afe9-847afd7550b8")
    public static final class MdaTypes {
        @objid ("63e99f8e-2e59-4263-a148-e515e5cc2ee6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("143e0a96-18af-4817-8140-5acfa1325b51")
        private static Stereotype MDAASSOCDEP;

        @objid ("343604bd-0b29-4212-b595-6f3d7c8b40eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c9dab88-dd8e-47a9-8534-8c511eda391e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ca031a70-7376-4397-ae2a-7ff762e285e1");
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
