/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
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
 * Proxy class to handle a {@link Port} with << Feature_Port >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("df72df64-fde5-4c17-ad49-37e1bb0285a0")
public class FeaturePort extends FeatureInstance {
<<<<<<< HEAD
    @objid ("d76b6889-7e16-4f17-8729-146372967749")
=======
    @objid ("ae58b272-c6d5-41cf-a396-6506f1049367")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Feature_Port";

    /**
     * Tells whether a {@link FeaturePort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << Feature_Port >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d3306df8-c223-41cc-ac7d-58214e971e03")
=======
    @objid ("eecfa634-27f6-4de8-88a5-88a273b2e75b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeaturePort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << Feature_Port >> then instantiate a {@link FeaturePort} proxy.
     * 
     * @return a {@link FeaturePort} proxy on the created {@link Port}.
     */
<<<<<<< HEAD
    @objid ("5b8e6b2a-79b8-4379-b255-88d0dd2be80c")
=======
    @objid ("76f2c0c8-f73e-4686-9ea0-b430a565354a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeaturePort create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeaturePort.STEREOTYPE_NAME);
        return FeaturePort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link FeaturePort} proxy from a {@link Port} stereotyped << Feature_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link FeaturePort} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("2fb84bc0-5380-42a4-9fde-4cfb20dabd7e")
=======
    @objid ("0ad7873d-8cdb-4771-bd7c-b52d5de4824c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeaturePort instantiate(final Port obj) {
        return FeaturePort.canInstantiate(obj) ? new FeaturePort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeaturePort} proxy from a {@link Port} stereotyped << Feature_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link FeaturePort} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("698178f8-2e31-493f-b60a-0ce20f8aa0fe")
=======
    @objid ("a5362d6b-ddfc-446f-9860-9118cd4ee30f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeaturePort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (FeaturePort.canInstantiate(obj))
        	return new FeaturePort(obj);
        else
        	throw new IllegalArgumentException("FeaturePort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("f1a29023-4e3a-4b8d-a9f2-6ebc8f573763")
=======
    @objid ("15e63215-46b3-4c38-9aae-df6e4d0d419a")
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
        FeaturePort other = (FeaturePort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("853a48c7-7a58-4b32-88f6-1ea80febf80b")
=======
    @objid ("a6d609cd-a160-4223-9908-ca5e57c4e5e0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

<<<<<<< HEAD
    @objid ("800e68db-ce27-4e21-998d-fdbd39cc9fe3")
=======
    @objid ("3134e53a-e583-4f13-b927-4e72a200b0aa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

<<<<<<< HEAD
    @objid ("4febfbaf-f3c6-47ad-872a-0dbe07b34c91")
=======
    @objid ("c8733ce6-5ee7-4453-a66f-a5cfedb3c91c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected FeaturePort(final Port elt) {
        super(elt);
    }

    @objid ("a8d9e562-ebce-4b04-a8f8-b81512ba3fd4")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("9a9e9c26-0922-482a-b3e2-b319a2056471")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ca73740a-3f6d-464c-bfc1-520d1453be6f")
        private static Stereotype MDAASSOCDEP;

        @objid ("2f876036-d923-45b6-bbc5-32c5da314908")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f981b944-f0e4-4e33-a73e-da91fbf3e475")
=======
        @objid ("d0760cc8-16fe-4adf-820b-6fc5214b452f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("610db1bf-e892-493f-9b05-98c7747a026b")
        private static Stereotype MDAASSOCDEP;

        @objid ("b4cc4c5a-72fc-4e04-a367-b4511cc68cfb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0a70dfda-9b18-404c-a8fa-992b95a67ef1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "18d0504c-73e0-4c7c-8341-53038298af2c");
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
