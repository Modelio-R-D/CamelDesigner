/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a141f9e8-ce8e-49a8-9ada-72385d9e69ca")
=======
    @objid ("a61d8f83-7c00-40d5-a88c-d305d6d51d08")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DataInstance_BindableInstance";

    /**
     * Tells whether a {@link DataInstanceBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << DataInstance_BindableInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("29db66e3-925b-4c23-9863-316f1ea49f0b")
=======
    @objid ("aed18d21-f5dc-4763-9989-46056e8115a7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << DataInstance_BindableInstance >> then instantiate a {@link DataInstanceBindableInstance} proxy.
     * 
     * @return a {@link DataInstanceBindableInstance} proxy on the created {@link BindableInstance}.
     */
<<<<<<< HEAD
    @objid ("4c7f45aa-daa6-4143-b1e5-d67a5377cfae")
=======
    @objid ("e590fea6-03e5-423e-9163-ffaac13f278b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a93c3dc2-b5e4-40cd-b4cb-60876f5f7887")
=======
    @objid ("9fda4300-7f27-4a18-8750-d811b4999508")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("21cd577c-6609-434f-b196-f4730472b2c0")
=======
    @objid ("adbbd5d7-c48b-4522-b6ac-a93569d1f630")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataInstanceBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (DataInstanceBindableInstance.canInstantiate(obj))
        	return new DataInstanceBindableInstance(obj);
        else
        	throw new IllegalArgumentException("DataInstanceBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("2abda279-afa1-4f23-a1a6-052c1a952f3e")
=======
    @objid ("4491fae2-6085-4ee2-91c6-6551b824b9a4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("beb25b26-37b3-4381-80b2-4fe464f670f9")
=======
    @objid ("129acd36-8551-4b91-b7be-50e4a37af404")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c96832da-e67f-4a4a-ab2c-dfea64d21b07")
=======
    @objid ("71d38042-e80a-4806-aa1a-68108ed6545b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DataInstance getOwner() {
        return (DataInstance)CamelDesignerProxyFactory.instantiate(((BindableInstance) this.elt).getCluster(), DataInstance.STEREOTYPE_NAME);
    }

<<<<<<< HEAD
    @objid ("2791b666-3e8b-42b5-ac51-9ddc70f02b87")
=======
    @objid ("f657282d-59d3-46f9-b6c7-87f86d56d0a7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b6774ec6-4cce-4ec5-a388-82ad3fcf94f6")
=======
    @objid ("c84945a5-6f31-407c-8e5e-4222a4feb9f4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("50e0778b-54c3-462c-85a9-35644eebb5ac")
=======
    @objid ("09b18e0b-8af8-4664-bf25-ef9030b28a4a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DataInstanceBindableInstance(final BindableInstance elt) {
        super(elt);
    }

    @objid ("a85bfe4a-348a-47dc-afe9-847afd7550b8")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("45e3e040-da71-450e-a56d-42a789ac333f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f4838b16-b825-4c24-a93f-e033c03fa560")
        private static Stereotype MDAASSOCDEP;

        @objid ("b914a8ff-fff9-492c-88c3-a8f7514ecabb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("26ce5273-160a-41c4-8f7c-2d575d585873")
=======
        @objid ("e56c6382-3312-419e-ad95-6d1999b19ea0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("14d3ffbc-b82d-4711-998b-b807882e6de0")
        private static Stereotype MDAASSOCDEP;

        @objid ("3bf6a26c-96f7-4d1e-a1f9-23136c9e64e0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("120ce79a-4192-472f-b15a-ff0822d74cb3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
