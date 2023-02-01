/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
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
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << MmsConceptInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("28cc79c1-8e23-4dd7-b100-83242c265aac")
public class MmsConceptInstance extends MmsObject {
<<<<<<< HEAD
    @objid ("32c7cc5c-0107-4aa5-919a-594fb4cd1482")
=======
    @objid ("4a35fbce-b321-4a53-bc7d-cb6cdb0d96e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "MmsConceptInstance";

    /**
     * Tells whether a {@link MmsConceptInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MmsConceptInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("dea01716-666e-4555-bb35-22051de4c2e0")
=======
    @objid ("e138b9c6-199e-4b93-8098-8a4c33d3ba3b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConceptInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MmsConceptInstance >> then instantiate a {@link MmsConceptInstance} proxy.
     * 
     * @return a {@link MmsConceptInstance} proxy on the created {@link Instance}.
     */
<<<<<<< HEAD
    @objid ("f16688d7-4149-48fd-be45-c6e67f420c0b")
=======
    @objid ("dc5d327e-fd24-4dbe-bda2-dab2e2568878")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static MmsConceptInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsConceptInstance.STEREOTYPE_NAME);
        return MmsConceptInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MmsConceptInstance} proxy from a {@link Instance} stereotyped << MmsConceptInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link MmsConceptInstance} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("a17ff19c-a9f2-4244-9f38-f748f4783010")
=======
    @objid ("61f2c5d2-45da-4c04-bb9e-516cb643b76b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static MmsConceptInstance instantiate(final Instance obj) {
        return MmsConceptInstance.canInstantiate(obj) ? new MmsConceptInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsConceptInstance} proxy from a {@link Instance} stereotyped << MmsConceptInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link MmsConceptInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("da9db3b2-158d-4aad-af9a-46928adc2d92")
=======
    @objid ("57372645-f56b-4d5e-838b-0b36134d5333")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static MmsConceptInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MmsConceptInstance.canInstantiate(obj))
        	return new MmsConceptInstance(obj);
        else
        	throw new IllegalArgumentException("MmsConceptInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'propertyInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("50826d4e-aa8a-47b4-ac35-ebb2abbef796")
=======
    @objid ("7bc6b18c-da20-44a7-99f1-bb5d782d270a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addPropertyInstance(final MmsPropertyInstance obj) {
        if (obj!=null)
          ((Instance) this.elt).getSlot().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("c408d928-c527-4161-bf2a-8e5e6bb07f49")
=======
    @objid ("0742a3e2-986d-4286-998a-7f1ba17955c6")
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
        MmsConceptInstance other = (MmsConceptInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("92d32b29-7ff5-4813-9069-3e63244a6a30")
=======
    @objid ("791962fc-7fdb-41b2-8772-753feaa8fc20")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'propertyInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("2102f71e-af86-4bb5-9789-2fccffbe52ab")
=======
    @objid ("5df22773-6c8b-474a-9389-2f33f7c43be4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<MmsPropertyInstance> getPropertyInstance() {
        List<MmsPropertyInstance> results = new ArrayList<>();
        for (AttributeLink mObj : ((Instance) this.elt).getSlot()){
        	if (MmsPropertyInstance.canInstantiate(mObj))
        			results.add((MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(mObj, MmsPropertyInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("393b5107-d130-4a42-ba5e-1f8bfca2f7fb")
=======
    @objid ("5535cfd8-05bf-4346-80ae-ea5477c9f56c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'propertyInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("87a053d2-194d-4a8c-b761-11cc2e22498a")
=======
    @objid ("55debb26-a7f0-43d7-a9fd-1c632fe5a868")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removePropertyInstance(final MmsPropertyInstance obj) {
        return (obj!=null)? ((Instance) this.elt).getSlot().remove(obj.getElement()) : false;
    }

    @objid ("2baa6855-5b67-45db-8394-3b858da971ce")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("41785617-13d3-44f6-93e3-bc533ab49a24")
=======
    @objid ("893d76ba-4996-4958-a554-b440b0bcb22f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MmsConceptInstance(final Instance elt) {
        super(elt);
    }

    @objid ("862d75e0-5992-4012-8c83-7a0ec8b66ab5")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("f6c0016d-c690-4f17-b2e3-0fd4ba00135e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8e1e840b-1605-4919-a048-b5b79c95a4b9")
        private static Stereotype MDAASSOCDEP;

        @objid ("7b4d057d-240b-4f46-a90a-c2ed0ac6c750")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b5994986-65f3-46b2-b6b3-86b1f6708ef1")
=======
        @objid ("a5f33d4b-9499-4058-8eed-321bc38084bb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("da36d100-cbfc-4cdd-b0a2-a232c66e42f7")
        private static Stereotype MDAASSOCDEP;

        @objid ("b43c188a-a64c-4137-9600-d6e4238c600e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bf9cd425-d4f4-41b5-9df5-5b55cfb98b88")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "81bc1a2f-1255-41fb-b517-5ca503ccc73e");
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
