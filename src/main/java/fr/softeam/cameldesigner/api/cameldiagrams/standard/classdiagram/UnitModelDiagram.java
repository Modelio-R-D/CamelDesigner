/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << UnitModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6d478936-9de1-4f27-959c-107efa6f197b")
public class UnitModelDiagram extends AbstractCamelDiagram {
    @objid ("9911971a-579b-472c-9725-630ab1f5de25")
    public static final String STEREOTYPE_NAME = "UnitModelDiagram";

    /**
     * Tells whether a {@link UnitModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << UnitModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("41c319dc-cebc-408e-9c9b-c080cf0941b4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << UnitModelDiagram >> then instantiate a {@link UnitModelDiagram} proxy.
     * 
     * @return a {@link UnitModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("944f6288-2390-4d17-98c1-743c188af167")
    public static UnitModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UnitModelDiagram.STEREOTYPE_NAME);
        return UnitModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link UnitModelDiagram} proxy from a {@link ClassDiagram} stereotyped << UnitModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link UnitModelDiagram} proxy or <i>null</i>.
     */
    @objid ("44b44e45-99c7-49dd-a49f-22044818b6b3")
    public static UnitModelDiagram instantiate(final ClassDiagram obj) {
        return UnitModelDiagram.canInstantiate(obj) ? new UnitModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnitModelDiagram} proxy from a {@link ClassDiagram} stereotyped << UnitModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link UnitModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8c9ed489-80e4-42bd-bbb2-07e7f37ba6ba")
    public static UnitModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (UnitModelDiagram.canInstantiate(obj))
        	return new UnitModelDiagram(obj);
        else
        	throw new IllegalArgumentException("UnitModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("548ecd19-4faf-44e6-aa20-94da9a103659")
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
        UnitModelDiagram other = (UnitModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("fa530dd2-76a3-4460-831a-2f636a60acca")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("445b2a82-36b4-4442-843b-bd2b7cef1451")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("768bfcdd-f648-459b-bdcf-7a7ca8faeda7")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("091791e3-d8a4-4876-9000-2d1e85f8c397")
    protected UnitModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("25ea4c22-2cce-4ce3-a7ad-b7eef6e812e6")
    public static final class MdaTypes {
        @objid ("d63de25c-f9b8-45e5-97c0-48376259e828")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b517216a-e6ab-4572-8387-3bb24cf919b8")
        private static Stereotype MDAASSOCDEP;

        @objid ("9fdb62db-2689-4462-a0f1-675fcd2ff30b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31653da6-7a98-4f11-a0e7-8c10073113d0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "447f259a-1b5e-46e1-8721-8c09653baaff");
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
