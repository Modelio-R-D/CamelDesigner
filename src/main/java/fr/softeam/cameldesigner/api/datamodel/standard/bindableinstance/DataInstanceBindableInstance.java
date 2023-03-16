/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("563b4fe4-ce63-4ffd-9f40-e1e28e334f6c")
    public static final String STEREOTYPE_NAME = "DataInstance_BindableInstance";

    /**
     * Tells whether a {@link DataInstanceBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << DataInstance_BindableInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7e383150-ea71-4b62-8c74-b60ba21f56e5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << DataInstance_BindableInstance >> then instantiate a {@link DataInstanceBindableInstance} proxy.
     * 
     * @return a {@link DataInstanceBindableInstance} proxy on the created {@link BindableInstance}.
     */
    @objid ("4f36e523-258b-4bce-abdb-5cd63ac1d00e")
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
    @objid ("3e9b08b9-15b2-4c53-ae82-eef6a6c44e7b")
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
    @objid ("890a8b0d-3e7c-49e8-936e-00668a36984a")
    public static DataInstanceBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (DataInstanceBindableInstance.canInstantiate(obj))
        	return new DataInstanceBindableInstance(obj);
        else
        	throw new IllegalArgumentException("DataInstanceBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("965cc9ba-a1aa-4747-b343-9ccb04e5019f")
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
    @objid ("7ef2e27f-b362-497c-a5d3-56a5c522a716")
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
    @objid ("2279678c-e69b-461b-b1f6-d7043d762b8b")
    public DataInstance getOwner() {
        return (DataInstance)CamelDesignerProxyFactory.instantiate(((BindableInstance) this.elt).getCluster(), DataInstance.STEREOTYPE_NAME);
    }

    @objid ("0de4298e-1df4-4e59-bc5c-9ea1771b8256")
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
    @objid ("c5c7d47a-2a9d-4fc3-a5a9-c830f8ec17c6")
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

    @objid ("7a3a442d-b514-41fd-b49e-f15edff65b46")
    protected DataInstanceBindableInstance(final BindableInstance elt) {
        super(elt);
    }

    @objid ("a85bfe4a-348a-47dc-afe9-847afd7550b8")
    public static final class MdaTypes {
        @objid ("c65d33de-01b3-488c-84af-383a3ce7cc50")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b593ebb-ebd5-4bc1-90df-039062d2dfde")
        private static Stereotype MDAASSOCDEP;

        @objid ("b68d21e2-cfc6-4186-98df-5b5049a56dde")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d2e63372-7702-446c-b41f-f69465a882e1")
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
