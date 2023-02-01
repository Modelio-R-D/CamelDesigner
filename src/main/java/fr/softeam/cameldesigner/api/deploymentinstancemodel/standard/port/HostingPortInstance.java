/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
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
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Port} with << HostingPortInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c7cd871c-65fe-47ef-94b0-65618ab304b4")
public class HostingPortInstance extends FeaturePort {
<<<<<<< HEAD
    @objid ("a3fe8422-30eb-4902-81d9-a5f6abc137ee")
=======
    @objid ("7689f2b4-baed-44ba-9565-764038d6c3e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "HostingPortInstance";

    /**
     * Tells whether a {@link HostingPortInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << HostingPortInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("2b576461-de8c-4e76-9414-adbd89db0d95")
=======
    @objid ("d33435d4-0f37-4cd9-b456-c64e136ada37")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPortInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << HostingPortInstance >> then instantiate a {@link HostingPortInstance} proxy.
     * 
     * @return a {@link HostingPortInstance} proxy on the created {@link Port}.
     */
<<<<<<< HEAD
    @objid ("c86768a8-7286-44c0-8251-0f3ecfcc902e")
=======
    @objid ("3dc43f01-2821-4590-a873-61a062b5856b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HostingPortInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HostingPortInstance.STEREOTYPE_NAME);
        return HostingPortInstance.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link HostingPortInstance} proxy from a {@link Port} stereotyped << HostingPortInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link HostingPortInstance} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("ec7ed4d2-e00c-4f48-8ecc-a74c4a1c3e7b")
=======
    @objid ("d5f776e6-d7c5-422d-b040-804e6d9b7c89")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HostingPortInstance instantiate(final Port obj) {
        return HostingPortInstance.canInstantiate(obj) ? new HostingPortInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HostingPortInstance} proxy from a {@link Port} stereotyped << HostingPortInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link HostingPortInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("3f18ed38-2822-4691-a72c-10cace77d5ab")
=======
    @objid ("5539fa9b-121a-4830-936d-fdaa6fb41f3c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HostingPortInstance safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (HostingPortInstance.canInstantiate(obj))
        	return new HostingPortInstance(obj);
        else
        	throw new IllegalArgumentException("HostingPortInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("ff1ce5e0-dac4-413e-b094-37a136fa89d8")
=======
    @objid ("25cbef40-2948-4821-9f53-6d7aac9125e0")
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
        HostingPortInstance other = (HostingPortInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("39eb476f-8bbb-49b1-b621-d1f98082d20e")
=======
    @objid ("e934f551-eccb-42be-b763-a4166dc14166")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("20a07d43-dc24-4000-9211-5ccb8ccdd474")
=======
    @objid ("ce303cae-eb82-4f37-8ae7-2dc832c7c200")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public HostingPort getType() {
        return (HostingPort)CamelDesignerProxyFactory.instantiate(((Port) this.elt).getRepresentedFeature(), HostingPort.STEREOTYPE_NAME);
    }

<<<<<<< HEAD
    @objid ("6ac82321-57c9-41cc-af34-e2eb3bbcf73d")
=======
    @objid ("518434ed-23e2-433a-a1b5-9cef0a6cf037")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("3f10762e-ebbf-4fae-bfce-9c2724a7f420")
=======
    @objid ("e93c05df-0fc6-4752-871d-880592098af2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setType(final HostingPort obj) {
        ((Port) this.elt).setRepresentedFeature((obj != null) ? obj.getElement() : null);
    }

    @objid ("a12c45e3-b24e-4c23-8821-230ce8bd6525")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("98476906-3e7d-4498-8735-3317a0132700")
=======
    @objid ("851fbca3-b002-44f0-97d9-8cbd3870dd58")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected HostingPortInstance(final Port elt) {
        super(elt);
    }

    @objid ("ed3d08ae-14c6-4868-b319-18cc92db0872")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("76d483ef-7000-44c4-aef2-82fe37cf3018")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9715b97f-f560-4249-9bf7-3090a80a1ada")
        private static Stereotype MDAASSOCDEP;

        @objid ("ded1e9f4-5484-4267-b2e0-83b6bacb7122")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7ee34ba9-ff68-4ad6-992e-de1f07d99d85")
=======
        @objid ("69d0b919-8b7e-420a-8713-7eec980b5526")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("43ba7e42-f6d3-4f06-ad8e-b2b9ed29832b")
        private static Stereotype MDAASSOCDEP;

        @objid ("3bd01e1e-323c-4605-a361-cd8e84922101")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b3406066-998f-443c-a963-6374a29d5ffc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b2bcf5bc-48d4-42cc-bc87-0ca2f2ca2812");
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
