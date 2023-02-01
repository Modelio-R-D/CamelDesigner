/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
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
 * Proxy class to handle a {@link DataType} with << UnitDimension >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1707f141-4e9c-4725-b618-05f025f22d01")
public class UnitDimension extends FeatureDataType {
<<<<<<< HEAD
    @objid ("3dd7cf3c-deb1-4402-9cd2-a97690dd73ce")
=======
    @objid ("c5eab56d-6dce-4f59-a783-0ce5ad1a62b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "UnitDimension";

    /**
     * Tells whether a {@link UnitDimension proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << UnitDimension >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("982faa9c-d7d5-44c1-b4a1-10f7dded984c")
=======
    @objid ("ddaa6e9f-ad70-479b-a67e-ec4a2b8f1bb7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitDimension.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << UnitDimension >> then instantiate a {@link UnitDimension} proxy.
     * 
     * @return a {@link UnitDimension} proxy on the created {@link DataType}.
     */
<<<<<<< HEAD
    @objid ("51b37ad3-0f68-4042-9443-139e41a7116d")
=======
    @objid ("bb21253c-400a-4617-a01d-005069a9ad02")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static UnitDimension create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UnitDimension.STEREOTYPE_NAME);
        return UnitDimension.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link UnitDimension} proxy from a {@link DataType} stereotyped << UnitDimension >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link UnitDimension} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("001cf68e-ed23-4776-943d-cb4083eca55e")
=======
    @objid ("9a94a2c6-d44b-4ab7-ab02-05b4f2c671a3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static UnitDimension instantiate(final DataType obj) {
        return UnitDimension.canInstantiate(obj) ? new UnitDimension(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnitDimension} proxy from a {@link DataType} stereotyped << UnitDimension >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link UnitDimension} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("2f37cb24-ae9c-451c-91d7-4ee47c3ecd26")
=======
    @objid ("fffaae27-69be-4678-9705-53a6d6d40ec8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static UnitDimension safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (UnitDimension.canInstantiate(obj))
        	return new UnitDimension(obj);
        else
        	throw new IllegalArgumentException("UnitDimension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("fdd107d6-e161-4024-bb16-ed24c95b23a9")
=======
    @objid ("862264b0-6ede-4e69-ad62-cd64291581a7")
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
        UnitDimension other = (UnitDimension) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("9453e7d6-0820-4d3b-bc4c-6565326e6423")
=======
    @objid ("55ff4455-c955-4abd-8ca9-98e8a95db3fe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

<<<<<<< HEAD
    @objid ("a3af32d0-4e05-4811-8d74-a913d72d1134")
=======
    @objid ("5d8a0eda-6255-41e0-9b93-ac8b7cd27769")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("404a3d74-e6ec-4fb4-b209-6e8bc5e16ad1")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("082941fa-77fb-4fbb-af61-09b6042f0a15")
=======
    @objid ("cde13aee-6f5a-4361-a510-d02b7713eb14")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected UnitDimension(final DataType elt) {
        super(elt);
    }

    @objid ("75da9eb1-b40f-49c3-9600-695ba46ea42f")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("ed2360f6-7d41-4117-a1e2-4cde607db710")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("08b1f436-f0b6-4ab2-b753-6082fda0d0a6")
        private static Stereotype MDAASSOCDEP;

        @objid ("73201dea-e2f3-494b-a1ef-9c20906efa9f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("677cee28-bb62-4079-ae38-58f19df08e18")
=======
        @objid ("662220cc-6faf-453d-bcf9-885c2d1aa347")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e1adfb4d-781b-44e1-8168-4467a1eb7da4")
        private static Stereotype MDAASSOCDEP;

        @objid ("ef9c9d98-27cb-435d-abb3-c6ebe0858952")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c1d8d4e8-f924-4400-a9c8-e42818bc23f6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ce437f2d-07f2-4127-9702-da4eb627b157");
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
