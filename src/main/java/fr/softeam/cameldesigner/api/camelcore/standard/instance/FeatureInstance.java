/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << Feature_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("026725c7-06a7-48a0-9a82-211b4a69fe6e")
public class FeatureInstance extends Feature {
<<<<<<< HEAD
    @objid ("61b6fba5-e81d-435f-b686-6d8df1133817")
=======
    @objid ("8a384113-b8f1-47e9-9b83-da548b4f3154")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Feature_Instance";

    /**
     * Tells whether a {@link FeatureInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Feature_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("8fc72e87-bb77-4051-8519-8714dabc3f21")
=======
    @objid ("b273fc83-7100-43a3-9890-3c415bc5e061")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Feature_Instance >> then instantiate a {@link FeatureInstance} proxy.
     * 
     * @return a {@link FeatureInstance} proxy on the created {@link Instance}.
     */
<<<<<<< HEAD
    @objid ("ed4b8578-7ed2-4d46-b396-506e2a2213cd")
=======
    @objid ("de7b002e-0ce0-4737-a7bb-2d035a1df476")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureInstance.STEREOTYPE_NAME);
        return FeatureInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link FeatureInstance} proxy from a {@link Instance} stereotyped << Feature_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link FeatureInstance} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("2875706b-8fd1-4f11-8590-b1ce8c0fdb60")
=======
    @objid ("dc1bb497-b6cc-4b7a-af67-7dda5b058c56")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureInstance instantiate(final Instance obj) {
        return FeatureInstance.canInstantiate(obj) ? new FeatureInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureInstance} proxy from a {@link Instance} stereotyped << Feature_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link FeatureInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("2a7c3fd8-20a5-4cce-a66f-d19840d63c3f")
=======
    @objid ("36887103-0e6f-438a-8421-5909fc6a94fe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (FeatureInstance.canInstantiate(obj))
        	return new FeatureInstance(obj);
        else
        	throw new IllegalArgumentException("FeatureInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("11fbf60c-b1b7-4d9e-83a9-112232e925ba")
=======
    @objid ("19dff8a1-fe91-4781-9a6b-f88533cb9f50")
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
        FeatureInstance other = (FeatureInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("4ba01acc-df1b-4797-94dd-8389d9f39529")
=======
    @objid ("9b30b4a2-b80a-47de-9fe0-e9571655bdbf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

<<<<<<< HEAD
    @objid ("251bfa0d-b77e-4a33-b3fe-c5b941d8686b")
=======
    @objid ("f2dcc2ef-eb32-4055-9c7c-9129dc0b4c7b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("41f7ed54-2997-4eed-96b5-8994764096dd")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("37a8d853-04bd-4e8a-8eef-e89a2eb58061")
=======
    @objid ("2b2627bb-9de9-4591-8899-c1f40cf10ea8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected FeatureInstance(final Instance elt) {
        super(elt);
    }

    @objid ("bf9810f2-5a6a-44a1-8c28-e5122e59ab09")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("29498d2d-e833-4b80-9ada-060a5d979c4c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7ab586eb-547d-491d-aaf1-1cd77373e669")
        private static Stereotype MDAASSOCDEP;

        @objid ("7dba2b1f-c706-4b5f-9409-5ae6231dc359")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c1114253-46b6-4000-954d-fe6c3b7e9ee5")
=======
        @objid ("ea5b40c0-473c-4d45-a982-d745661ff89b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e014d875-c7c1-4b38-be3b-5cffd74e5eeb")
        private static Stereotype MDAASSOCDEP;

        @objid ("ceef4e2f-c46b-4db0-89ef-84b21c06245d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("434d0255-4015-4805-a74f-0e9c87961f06")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "df209aca-1325-4c99-b383-ca2650224ff6");
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
