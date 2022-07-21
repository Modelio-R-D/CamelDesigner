/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("79daefa4-d4eb-4a96-97f3-180e88dff371")
    public static final String STEREOTYPE_NAME = "RangeUnion";

    /**
     * Tells whether a {@link RangeUnion proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << RangeUnion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1ad4abc9-cfa0-409c-8b0a-b3495c22b7ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RangeUnion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << RangeUnion >> then instantiate a {@link RangeUnion} proxy.
     * 
     * @return a {@link RangeUnion} proxy on the created {@link DataType}.
     */
    @objid ("ede62ab5-b474-44b2-9d41-53cb2b5c88bd")
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
    @objid ("5e80f3ab-bdea-4fcb-8f07-9a2f5a4e5dc2")
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
    @objid ("f11102ed-c3eb-4238-bf2e-5b7041f9c7b4")
    public static RangeUnion safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (RangeUnion.canInstantiate(obj))
        	return new RangeUnion(obj);
        else
        	throw new IllegalArgumentException("RangeUnion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3b35fc20-e3b2-4936-8ee3-a55728b4532d")
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
    @objid ("4f7257c0-0b35-469e-8b40-f6ecff15fb4e")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("51ef6448-af73-4194-b039-802fa8085bf9")
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

    @objid ("5d73b79d-79f2-4bec-83ba-d1cf94abcc61")
    protected RangeUnion(final DataType elt) {
        super(elt);
    }

    @objid ("a86c3c8e-3fec-4d3f-8ea5-0137b2bd07d5")
    public static final class MdaTypes {
        @objid ("507c5f1a-8ebf-462b-beba-db7808451448")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ca5f4636-23a5-4e73-bab3-d94c32f7449c")
        private static Stereotype MDAASSOCDEP;

        @objid ("1b0d4f19-e9d2-457d-b242-2b265f6002b1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ab63d409-5920-4342-9c67-94eb896264ae")
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
