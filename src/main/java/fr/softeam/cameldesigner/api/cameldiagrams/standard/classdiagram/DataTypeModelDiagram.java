/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
 * Proxy class to handle a {@link ClassDiagram} with << DataTypeModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("05f54bfd-dbfd-4864-835a-f9d72e6569b8")
public class DataTypeModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("6aec78d2-a1af-4caa-8273-2280b4f05b44")
=======
    @objid ("ff27a28e-74fd-4a3b-adf4-1993a3ec9ebe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DataTypeModelDiagram";

    /**
     * Tells whether a {@link DataTypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DataTypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("c90a5240-aae3-41a2-aac3-321b4d296782")
=======
    @objid ("d9646c00-0076-48de-bc4f-d0285ea20b7c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DataTypeModelDiagram >> then instantiate a {@link DataTypeModelDiagram} proxy.
     * 
     * @return a {@link DataTypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("9e8b64c1-0bb4-42ea-a749-b948cf452ca9")
=======
    @objid ("0c60c15d-96ad-438a-abc8-5239986e10b6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataTypeModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModelDiagram.STEREOTYPE_NAME);
        return DataTypeModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DataTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DataTypeModelDiagram} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("b92fbace-bbda-40e3-8ad8-215bbf407f59")
=======
    @objid ("175b5448-b243-42b4-853d-a057422724a3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataTypeModelDiagram instantiate(final ClassDiagram obj) {
        return DataTypeModelDiagram.canInstantiate(obj) ? new DataTypeModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DataTypeModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("e32750bb-0e45-4785-b510-851ab547b371")
=======
    @objid ("c6098588-268a-443b-aa85-d14e47e952da")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataTypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DataTypeModelDiagram.canInstantiate(obj))
        	return new DataTypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DataTypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("c063ea01-146a-454e-96c0-40f592bc28db")
=======
    @objid ("978c971b-4e3d-45e2-b588-a65c9024e1b2")
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
        DataTypeModelDiagram other = (DataTypeModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("daab9a54-79f8-4176-bcc2-c6896c9dc6e4")
=======
    @objid ("09a211e3-1216-4901-9710-601c483dc2ac")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("cb5f210b-bddd-486e-8e9f-1d68a3d4e090")
=======
    @objid ("20feef08-a625-418f-9ed6-76c08591502d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("13c6ee94-bae8-4378-89df-f30f295f1858")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("677c6aeb-279a-4608-898d-b9d3687fb28a")
=======
    @objid ("d77c5458-6d5b-4c9a-bafa-5a1d79610c3c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DataTypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("2da9cb4c-8a06-4c65-8a65-2240141641c4")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("911f5f69-0645-4dcd-8a59-a2271e6e314f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("477503bf-50c1-46c8-acb0-a2b1c7960c4d")
        private static Stereotype MDAASSOCDEP;

        @objid ("0f50db67-44e4-498d-8ba5-efc7045c9ae9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("12849a86-1023-413d-9306-bdb9890e5178")
=======
        @objid ("2333e865-f2cb-4899-a72e-e683c89e2d1a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f7092a55-432c-421b-b982-476e8de77229")
        private static Stereotype MDAASSOCDEP;

        @objid ("a9701757-f04a-499a-8b97-b057c398846a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8b543cff-e3f4-4e71-9cc8-15bab4ad0903")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fc779080-0243-43b7-a1e1-9ddf71de93d7");
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
