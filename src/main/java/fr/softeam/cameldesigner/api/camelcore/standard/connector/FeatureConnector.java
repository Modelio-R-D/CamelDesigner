/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << Feature_Connector >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e8779648-b44d-4776-a06d-d33bf013b2d7")
public class FeatureConnector extends Feature {
<<<<<<< HEAD
    @objid ("052ad8b0-f91e-4163-86fb-b494c729b853")
=======
    @objid ("06732acd-febc-476f-b2b6-047d8a3ce71c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Feature_Connector";

    /**
     * Tells whether a {@link FeatureConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Feature_Connector >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("f644323a-359a-4b96-a4f3-5545174323e7")
=======
    @objid ("f9bb56ef-e264-4f86-827d-53bc6bcfaf4f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Feature_Connector >> then instantiate a {@link FeatureConnector} proxy.
     * 
     * @return a {@link FeatureConnector} proxy on the created {@link Connector}.
     */
<<<<<<< HEAD
    @objid ("24175b2e-1d25-4984-99be-72c11341b250")
=======
    @objid ("9fe05518-bbff-401e-ba32-4f37d3fdf7e2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureConnector create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureConnector.STEREOTYPE_NAME);
        return FeatureConnector.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link FeatureConnector} proxy from a {@link Connector} stereotyped << Feature_Connector >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link FeatureConnector} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("7cc139b7-be4c-4521-842e-d428dd79324b")
=======
    @objid ("8cc558e2-3e41-450e-acfb-b836e6b9625e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureConnector instantiate(final Connector obj) {
        return FeatureConnector.canInstantiate(obj) ? new FeatureConnector(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureConnector} proxy from a {@link Connector} stereotyped << Feature_Connector >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link FeatureConnector} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("3261806e-0993-485c-a4dd-ca2c77d92697")
=======
    @objid ("12524382-6ad7-4602-9e42-f9c78aaec2de")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (FeatureConnector.canInstantiate(obj))
        	return new FeatureConnector(obj);
        else
        	throw new IllegalArgumentException("FeatureConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("296524e3-1675-4dc5-9692-bb9a2faba776")
=======
    @objid ("1e4d2387-b2e5-4931-8f94-3613589ea0ca")
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
        FeatureConnector other = (FeatureConnector) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("d21506ef-a436-41c6-b4fc-31ad9d3fc60d")
=======
    @objid ("e957ae65-6ee9-4079-b63c-48a613b6b3c7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

<<<<<<< HEAD
    @objid ("d7b93e72-c462-43ac-9aa5-469ef6918e6d")
=======
    @objid ("e8edc705-e181-4b1d-a7d3-f56ea9c986bb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b0ac0664-9e5c-4d5f-bd16-84f8e88c845b")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("d29df6a7-2c62-4e13-8345-61ce94497a64")
=======
    @objid ("d077a91e-aa5b-4657-8724-0c42194189f1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected FeatureConnector(final Connector elt) {
        super(elt);
    }

    @objid ("6b5ec3ef-f04f-448d-b275-ff41664d9e6e")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("044aadbc-bef5-47ad-88f1-b5e0b3f960f3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5fd93f8a-1fa2-469d-8f07-0d09fe059472")
        private static Stereotype MDAASSOCDEP;

        @objid ("7cbe340d-2b95-420d-81d9-877be92a8185")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2cc904e-1786-4fd5-a5fd-be0c43b6eb3f")
=======
        @objid ("7b48a837-e5ab-49d3-b543-21c2dfc32e01")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0ffc5300-2bfd-4a6c-8194-f765896d2792")
        private static Stereotype MDAASSOCDEP;

        @objid ("6167f10f-fabc-4dfc-b14f-949ca724fb5e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d230d8d-4f2c-433a-8bd0-8a7198d98e66")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e94d1d27-429c-47ce-a373-e940bf1bf49b");
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
