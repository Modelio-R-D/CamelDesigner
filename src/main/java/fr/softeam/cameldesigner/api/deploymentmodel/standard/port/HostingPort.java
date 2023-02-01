/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
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
 * Proxy class to handle a {@link Port} with << HostingPort >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bf141fb2-a5e7-4adf-9870-921e4a516048")
public class HostingPort extends FeaturePort {
<<<<<<< HEAD
    @objid ("f1a655d7-206d-4470-9fd4-51ba4b4cdfd7")
=======
    @objid ("b8eac166-7c28-4183-935b-1839c4432ed8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "HostingPort";

    /**
     * Tells whether a {@link HostingPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << HostingPort >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("4a4b2acb-0b96-41a6-a474-442146c654ac")
=======
    @objid ("f24447f8-f342-4127-9844-32531e07ec80")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << HostingPort >> then instantiate a {@link HostingPort} proxy.
     * 
     * @return a {@link HostingPort} proxy on the created {@link Port}.
     */
<<<<<<< HEAD
    @objid ("ebfd1866-43a3-4f92-88ec-4f40151dfdc0")
=======
    @objid ("955c7024-7875-49ec-a76d-9b1d9b528228")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HostingPort create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HostingPort.STEREOTYPE_NAME);
        return HostingPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link HostingPort} proxy from a {@link Port} stereotyped << HostingPort >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link HostingPort} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("9cbb2da2-69f3-4151-841b-dee31ebe137e")
=======
    @objid ("629bb9ac-1b7e-42d7-b369-9263eaa4fdd0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HostingPort instantiate(final Port obj) {
        return HostingPort.canInstantiate(obj) ? new HostingPort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HostingPort} proxy from a {@link Port} stereotyped << HostingPort >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link HostingPort} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("7fb950fa-de0f-4e74-9dc4-f426251d8dde")
=======
    @objid ("d386e231-faaa-4d08-bf7d-19e45f114be8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HostingPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (HostingPort.canInstantiate(obj))
        	return new HostingPort(obj);
        else
        	throw new IllegalArgumentException("HostingPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("3305d0fb-384d-4483-bab6-1e6fef0215b3")
=======
    @objid ("b44dd504-083c-49f2-8354-ee4ba2bb593f")
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
        HostingPort other = (HostingPort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("116f2758-184b-45d1-977e-7ed37d565a4e")
=======
    @objid ("0b178746-34ae-4450-89d8-6a84fcd99b41")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

<<<<<<< HEAD
    @objid ("2dceeaf4-1374-4563-b981-a9c1272914c3")
=======
    @objid ("44d80a18-b9b9-4cc8-9df9-1573aab0ee3d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fc47b2fa-358f-4eae-98fa-43a615e781d3")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("3ce0a639-4d5f-475d-a51a-336245fc829e")
=======
    @objid ("c92d7558-6d05-4e49-a2ed-fdb884975f8a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected HostingPort(final Port elt) {
        super(elt);
    }

    @objid ("98fe20f6-f33e-4b62-b8ea-1f4b27c8cf6e")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("743454e8-4ccf-49e7-b193-01eda288543c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1dc1bcbf-4365-4b16-b720-589c595b5257")
        private static Stereotype MDAASSOCDEP;

        @objid ("b519d786-38b3-4794-83ec-dafa7051c894")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c6dbc5fb-a695-4179-83bf-742559c83f93")
=======
        @objid ("066c3336-ada8-46f8-b1b2-ec3c4881d151")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("092914a7-6c11-40e5-bb66-8f836cff1068")
        private static Stereotype MDAASSOCDEP;

        @objid ("960cf36e-64cd-4580-b334-2b8b2131fc99")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fb33a31d-09d6-4703-ae14-6a44f3668f9e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0672a25d-20e7-4566-b187-f3f3572d73c3");
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
