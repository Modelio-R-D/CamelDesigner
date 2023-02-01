/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.typemodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << RangeUnion >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("418feac3-a018-487d-af79-66ed2a10b317")
public class RangeUnion extends ValueType {
<<<<<<< HEAD
    @objid ("7a515f8b-4b31-4d51-b5e9-95f47ae7fed3")
=======
    @objid ("3b83a6c4-af20-47cd-b044-124948e07af6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "RangeUnion";

    /**
     * Tells whether a {@link RangeUnion proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << RangeUnion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("ee07b465-aac1-47eb-94ab-a6a5365ff85c")
=======
    @objid ("e21b7cda-8fa1-4a7c-9545-51ac5911537c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RangeUnion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << RangeUnion >> then instantiate a {@link RangeUnion} proxy.
     * 
     * @return a {@link RangeUnion} proxy on the created {@link DataType}.
     */
<<<<<<< HEAD
    @objid ("f259e8b9-21ce-4740-96af-d62da4d818bb")
=======
    @objid ("032ce23a-89d2-41b9-8364-54620e0f4fd6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RangeUnion create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RangeUnion.STEREOTYPE_NAME);
        return RangeUnion.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link RangeUnion} proxy from a {@link DataType} stereotyped << RangeUnion >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link RangeUnion} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("42256ba5-072e-4630-8764-6540887fa10b")
=======
    @objid ("e7ad1096-dddd-43db-b0ea-3fba2b98a8ab")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RangeUnion instantiate(final DataType obj) {
        return RangeUnion.canInstantiate(obj) ? new RangeUnion(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RangeUnion} proxy from a {@link DataType} stereotyped << RangeUnion >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link RangeUnion} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("8bc7a181-1c2e-4a46-be11-de88a6f014fa")
=======
    @objid ("fae78aa6-54e0-453e-acb6-65824c3e5407")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RangeUnion safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (RangeUnion.canInstantiate(obj))
        	return new RangeUnion(obj);
        else
        	throw new IllegalArgumentException("RangeUnion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("f475dc6e-71c1-4235-ae74-abee3a9b2c28")
=======
    @objid ("9583abee-73ba-4651-9748-8e57229a1ee3")
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
        RangeUnion other = (RangeUnion) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("da786a01-1238-493b-9761-f82469c92251")
=======
    @objid ("431b8e10-42c1-4bab-bf57-d549f7267495")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

<<<<<<< HEAD
    @objid ("8ae5bb81-f292-42f4-a4f8-fbc2a9a5e87c")
=======
    @objid ("b3998a52-014b-463e-9fc1-c35b3382861b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("80de2d45-3301-44b5-b4f9-7c71a9204e8a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("dbc5cd63-e61f-4ae3-9665-bf9d40af0e6d")
=======
    @objid ("c0b6666e-19d8-4f66-9383-fc299de85d3a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected RangeUnion(final DataType elt) {
        super(elt);
    }

    @objid ("a86c3c8e-3fec-4d3f-8ea5-0137b2bd07d5")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("02d873c9-0559-4bc9-8db0-6827cec4884b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2c044bb7-e158-4630-9624-278e0ed74a08")
        private static Stereotype MDAASSOCDEP;

        @objid ("141c5bd2-eef2-4980-a717-0a5791ac49d5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("865bf238-16f6-4bd2-886f-2d23a885ce69")
=======
        @objid ("306dc2f1-0437-4cea-8edc-6086b7400dca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("48abfe65-afe7-4f9c-9136-75b9aadd2159")
        private static Stereotype MDAASSOCDEP;

        @objid ("27052922-e07b-46a8-b7d8-4f379bce35a0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a0539725-86e2-45be-bbc6-f8a7c3a5468e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aeb307d4-49c6-4201-b285-a8ba93b291fb");
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
