/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.Annotation;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.PropertyDependency;
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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << CamelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e19016d0-0edb-4a41-bbf9-7506c03fcd5e")
public abstract class CamelElement {
<<<<<<< HEAD
    @objid ("68f3a98c-2fd7-4fad-bb53-7a0c2081cbbd")
=======
    @objid ("3e628ae0-751b-42f3-9e36-bf62032a83e9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "CamelElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("8683cc50-40d8-4bb4-a75d-2ffa9153294a")
=======
    @objid ("2c1968b7-4db5-49ae-8d92-c5782ab6f08e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CamelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CamelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("fd1e4770-b039-4324-b18b-cd9159cd9e0b")
=======
    @objid ("edd63273-c74d-47b6-8453-b3b055cedb5a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelElement.STEREOTYPE_NAME));
    }

    @objid ("a4e4903c-fa45-457b-abd6-85a6ac790ea3")
    public static CamelElement instantiate(final ModelElement obj) {
        return NamedElement.canInstantiate(obj) ? NamedElement.instantiate(obj) :
            PropertyDependency.canInstantiate(obj) ? PropertyDependency.instantiate((Dependency)obj) :
                Annotation.canInstantiate(obj) ? Annotation.instantiate((Dependency)obj) : null;
    }

<<<<<<< HEAD
    @objid ("3fc923da-3412-4daa-8830-3547e371f841")
=======
    @objid ("aa359e8d-e92b-4bab-8787-1aa04ffafba1")
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
        CamelElement other = (CamelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("e1d0ce46-a16e-4cce-8f70-ee9cc0e87457")
=======
    @objid ("29cc6954-e09a-4364-8e1b-a3472c94e394")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public ModelElement getElement() {
        return this.elt;
    }

<<<<<<< HEAD
    @objid ("cc4c0af2-be53-4066-a60d-b983492c388c")
=======
    @objid ("97a4be69-1d53-4659-92fd-e3bd89e8e2dd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("030a2c20-cdf9-4226-a2af-5a26b172d361")
    public List<CamelElement> getChilds() {
        return new ArrayList<>();
    }

<<<<<<< HEAD
    @objid ("0194548e-f81e-4aa0-89a5-0e919411d5b8")
=======
    @objid ("13132bfe-6323-4be4-86c4-4b970674df63")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CamelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1755d7a2-ba56-47fd-b0d2-652ed674f106")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("78a40174-9363-45ba-8b82-d3d053d99504")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fe31ac72-1d11-49a8-a9fa-ed3459adcaf6")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e9a6f20-46bc-4f65-9ee0-444378328236")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("909712ea-22e9-4d56-b460-c673e8d00ba6")
=======
        @objid ("7387b814-5e02-47af-9f2f-eca086f22795")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("111f48fc-dc7d-4baf-a2d7-56509d699fb0")
        private static Stereotype MDAASSOCDEP;

        @objid ("9c68b1b9-33a1-4bf6-8ca0-773538d3244c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e1299823-e92c-4f6d-810a-af829a7a9641")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9aef4bd8-fa92-4231-9295-3eb5a619ceab");
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
