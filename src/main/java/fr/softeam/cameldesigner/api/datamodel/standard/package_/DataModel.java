/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.datamodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << DataModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("de455c3b-3874-4127-a7ee-cf93060c1056")
public abstract class DataModel extends SubModel {
<<<<<<< HEAD
    @objid ("2f039cb3-9ce1-4219-9d58-3fe326136782")
=======
    @objid ("38d338a6-64c3-460c-a680-a5a25fb5ed8c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DataModel";

    /**
     * Tells whether a {@link DataModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DataModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("cc3041a2-7fe1-4d77-9a73-d6935bdeb619")
=======
    @objid ("ced03911-8a3c-4759-be5f-334a7136217a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataModel.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("0493236e-d743-4094-b8fe-42b26fb0951e")
=======
    @objid ("0141a80e-c5f2-4867-b7b5-44fa00d7d7a5")
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
        DataModel other = (DataModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("57c854f5-19cf-47be-802e-0a6a1dd406c5")
=======
    @objid ("0c2e6fdb-d168-4c5f-b446-0339387e4c6d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

<<<<<<< HEAD
    @objid ("60c7e653-c2e3-4711-a037-eba0f983e4f7")
=======
    @objid ("f64210d4-f4fb-4cf0-b4d5-4548c0886d5b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cabb5eea-777f-40f0-9d23-842c2faa7725")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("1c6ee447-f41e-437a-8359-e662e29ef884")
=======
    @objid ("c3deac06-c583-4bf1-a9fd-3107bf4fdbe7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DataModel(final Package elt) {
        super(elt);
    }

    @objid ("be9685ad-a9b6-4bba-8516-6e7e03cecdde")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("8841c811-0ada-4931-b176-ee6b4a19fd1d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cacef9ca-7c13-4630-8e7c-3311dd392582")
        private static Stereotype MDAASSOCDEP;

        @objid ("455667a8-0be6-4bfa-94e0-a7e0dbc3ef2e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("98935b37-eb5a-44a8-88a6-1959f23706a6")
=======
        @objid ("de041796-f07a-4bc0-acf0-707a0e5f0fce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2996c9ce-c1da-4bc9-9211-e7d4dd83576d")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e0d6226-1c4f-478a-b670-dfa2856b8a5e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9727d3a0-51f6-45b3-82a9-06c255b32c10")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "69b59850-29a3-4354-afc2-617679c2ef73");
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
