/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("6e930e0d-8775-42b6-a6a7-f0b54bcb6428")
    public static final String STEREOTYPE_NAME = "DataInstance_BindableInstance";

    /**
     * Tells whether a {@link DataInstanceBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << DataInstance_BindableInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f07b4753-1775-40dc-8109-d6a2f829ddad")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << DataInstance_BindableInstance >> then instantiate a {@link DataInstanceBindableInstance} proxy.
     * 
     * @return a {@link DataInstanceBindableInstance} proxy on the created {@link BindableInstance}.
     */
    @objid ("e2a9c363-c681-4256-9332-0ffaf0f4603b")
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
    @objid ("372adfd9-d7f6-43b5-8d74-3abd89fee4ea")
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
    @objid ("c40cd7d7-307c-4d60-8dc1-40218ccf180b")
    public static DataInstanceBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (DataInstanceBindableInstance.canInstantiate(obj))
        	return new DataInstanceBindableInstance(obj);
        else
        	throw new IllegalArgumentException("DataInstanceBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5cde9a5e-2aec-4eeb-9f63-1eff73ea372e")
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
    @objid ("a14c9e01-fc8d-464e-a94e-ca33b276a391")
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
    @objid ("5760e46c-28c2-4142-ba4d-9054ec1a4cad")
    public DataInstance getOwner() {
        return (DataInstance)CamelDesignerProxyFactory.instantiate(((BindableInstance) this.elt).getCluster(), DataInstance.STEREOTYPE_NAME);
    }

    @objid ("d231ae64-5f83-4478-a9c5-a9e0f5feefda")
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
    @objid ("548668f8-80f6-404f-9fe9-039d7294fac6")
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

    @objid ("74186e4f-bc5f-4855-92bd-0d8012db228f")
    protected DataInstanceBindableInstance(final BindableInstance elt) {
        super(elt);
    }

    @objid ("a85bfe4a-348a-47dc-afe9-847afd7550b8")
    public static final class MdaTypes {
        @objid ("a1e51274-af96-4dce-bd59-c3bc1fdc7164")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("009c7f65-5f4a-49de-aec7-55f02097f3af")
        private static Stereotype MDAASSOCDEP;

        @objid ("8264e6f6-efe9-4860-acfc-dcad36d48ba0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1ea5ce7d-ed00-4f7c-916d-0be97c970e86")
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
