/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction;
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
 * Proxy class to handle a {@link Class} with << HorizontalScalingAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9043ebaf-e900-49af-8abc-87dbea13b475")
public class HorizontalScalingAction extends ScalingAction {
<<<<<<< HEAD
    @objid ("ec63c6e4-5f68-488d-96d4-ba83b3d911ca")
    public static final String STEREOTYPE_NAME = "HorizontalScalingAction";

    @objid ("a008b688-394d-4382-875e-3b7f97fd55c0")
=======
    @objid ("a2b00e36-5b9e-4274-aa73-a55edba7c314")
    public static final String STEREOTYPE_NAME = "HorizontalScalingAction";

    @objid ("38cf4c2f-1f3b-47a7-a8f6-72685542b51d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String COUNT_TAGTYPE = "count";

    /**
     * Tells whether a {@link HorizontalScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HorizontalScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d39c6055-85cd-4c76-96d7-2a04306f7272")
=======
    @objid ("3a5401f6-5532-4de6-8fba-10bc93c6f644")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScalingAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HorizontalScalingAction >> then instantiate a {@link HorizontalScalingAction} proxy.
     * 
     * @return a {@link HorizontalScalingAction} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("a10d4966-e97a-470e-a757-36edeb7733e4")
=======
    @objid ("251384bb-e73a-4d3f-9125-bec465064e02")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HorizontalScalingAction create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HorizontalScalingAction.STEREOTYPE_NAME);
        return HorizontalScalingAction.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link HorizontalScalingAction} proxy from a {@link Class} stereotyped << HorizontalScalingAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link HorizontalScalingAction} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("963bf447-b696-43fc-863a-3699f6ec16f7")
=======
    @objid ("0fed2f37-51c0-4d20-9f93-d6720dacafd3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HorizontalScalingAction instantiate(final Class obj) {
        return HorizontalScalingAction.canInstantiate(obj) ? new HorizontalScalingAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HorizontalScalingAction} proxy from a {@link Class} stereotyped << HorizontalScalingAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link HorizontalScalingAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("96ab0295-5089-4169-800d-6f8ce0864f6f")
=======
    @objid ("6875a8f4-b03f-4409-b30e-571479bbe7e5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HorizontalScalingAction safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HorizontalScalingAction.canInstantiate(obj))
        	return new HorizontalScalingAction(obj);
        else
        	throw new IllegalArgumentException("HorizontalScalingAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("feb58e31-e844-4390-9a5f-345b1deb3b75")
=======
    @objid ("6d304f94-a700-4db6-83ac-1ef50057c859")
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
        HorizontalScalingAction other = (HorizontalScalingAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'count'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("3bbc0d12-eb31-4ba0-ab19-7bd157b61097")
=======
    @objid ("154ce19a-ee50-4e46-960a-3d72f33b445b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getCount() {
        return this.elt.getTagValue(HorizontalScalingAction.MdaTypes.COUNT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("f4887337-ea3b-420c-9ffa-63a103ff51f1")
=======
    @objid ("2ffff716-a922-4804-8a7d-a451d4db4203")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("f9097202-ffa8-4cc1-8531-d9047c658f7c")
=======
    @objid ("919f37c1-effd-4caa-872c-5b9533fcd6cb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'count'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("20fd36e2-365e-46f7-8749-43807bcdfb33")
=======
    @objid ("10d116a1-b7e5-4f09-bea7-ac3cb089dbdf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCount(final String value) {
        this.elt.putTagValue(HorizontalScalingAction.MdaTypes.COUNT_TAGTYPE_ELT, value);
    }

    @objid ("6dc98a86-5601-487a-8855-ca9e418fc552")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("c81a9fd0-6931-4635-84b4-81642356dae9")
=======
    @objid ("0c0fc4f1-8b99-4a05-9963-974745cb6be6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected HorizontalScalingAction(final Class elt) {
        super(elt);
    }

    @objid ("903e4b65-68e5-46fa-8af6-f2905c82423f")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("8a55964d-5a68-469d-a344-75b5fa4400a5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("418d71bb-e799-4b1f-80af-ef3f7564f5df")
        public static TagType COUNT_TAGTYPE_ELT;

        @objid ("70af486a-3211-4272-97c3-02ec79147645")
        private static Stereotype MDAASSOCDEP;

        @objid ("15bfc7e5-5b9b-4b5a-a5ac-b9eb1fde5458")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("23ad7ecb-d26e-435e-a7e3-d1302f41595d")
=======
        @objid ("752fa4fb-1706-45d4-a23c-a6e668071884")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c02668ef-856f-4691-9614-66abf54178cd")
        public static TagType COUNT_TAGTYPE_ELT;

        @objid ("01aae487-e0a6-444f-93d7-71fbdf1ff0ea")
        private static Stereotype MDAASSOCDEP;

        @objid ("e1fd6af3-040a-480f-b0ac-216171baba9a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ee4c0708-a7bb-4378-94da-704b5d4c1f00")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "99008d6c-2622-4467-8283-6059df42c240");
            COUNT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d52b6541-1841-4607-96a8-591ad329e65f");
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
