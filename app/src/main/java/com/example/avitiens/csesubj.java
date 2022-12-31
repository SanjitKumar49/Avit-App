package com.example.avitiens;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class csesubj extends AppCompatActivity {
    private ImageView sem3ajp, sem3cd, sem3eh, sem3ooad, sem3dmm, sem3dmdw;
    private TextView one, two, three, four, five, six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesubj);

        one = findViewById(R.id.ajpajp);
        two = findViewById(R.id.cdcd);
        three = findViewById(R.id.eheh);
        four = findViewById(R.id.ooadooad);
        five = findViewById(R.id.dmmdmm);
        six = findViewById(R.id.dmdwdmdw);

        sem3ajp = findViewById(R.id.sem5ajp);
        sem3cd = findViewById(R.id.sem5cd);
        sem3eh = findViewById(R.id.sem5eh);
        sem3ooad = findViewById(R.id.sem5ooad);
        sem3dmm = findViewById(R.id.sem5dmm);
        sem3dmdw = findViewById(R.id.sem5dmdw);

        String str = getIntent().getStringExtra("allcse");
        if (str.equals("threesem")) {
            one.setText("OOPS");
            {
                sem3ajp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("datapass", "IMG_20221231_002210");
                        startActivity(intent);
                    }
                });
            }

            two.setText("DBMS");
            {
                sem3cd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("datapass", "IMG_20221231_002251");
                        startActivity(intent);
                    }
                });

                three.setText("DAA");
                {
                    sem3eh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221231_002349");
                            startActivity(intent);
                        }
                    });
                }
                four.setText("CA");
                {
                    sem3ooad.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221231_002318");
                            startActivity(intent);
                        }
                    });
                }
                five.setText("SE");
                {
                    sem3dmm.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221231_004303");
                            startActivity(intent);
                        }
                    });
                }
                six.setText("NM&NT");
                {
                    sem3dmdw.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221231_004152");
                            startActivity(intent);
                        }
                    });
                }
            }
        }
        // for question paper
        else if (str.equals("threesem1")) {
            one.setText("OOPS");
            {
                sem3ajp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, questionpaper.class);
                        intent.putExtra("datapass", "iat1");
                        startActivity(intent);
                    }
                });
            }
        }
    else if (str.equals("foursem")) {
                one.setText("java");
                {
                    sem3ajp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221230_162305");
                            startActivity(intent);
                        }
                    });
                }
                two.setText("CN");
                {
                    sem3cd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221230_162245");
                            startActivity(intent);
                        }
                    });

                    three.setText("OS");
                    {
                        sem3eh.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162217");
                                startActivity(intent);
                            }
                        });
                    }
                    four.setText("PQT");
                    {
                        sem3ooad.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162016");
                                startActivity(intent);
                            }
                        });
                    }
                    five.setText("Egile");
                    {
                        sem3dmm.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162501");
                                startActivity(intent);
                            }
                        });
                    }
                    six.setText("EVS");
                    {
                        sem3dmdw.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162047");
                                startActivity(intent);
                            }
                        });
                    }
                }
            } else if (str.equals("fivesem")) {
                sem3ajp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("datapass", "ajp");
                        startActivity(intent);
                    }
                });
                sem3cd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("datapass", "IMG_20221230_133036");
                        startActivity(intent);
                    }
                });
                sem3eh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("datapass", "IMG_20221230_132933");
                        startActivity(intent);
                    }
                });
                sem3ooad.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("datapass", "IMG_20221230_133003");
                        startActivity(intent);
                    }
                });
                sem3dmm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("datapass", "IMG_20221230_102847");
                        startActivity(intent);
                    }
                });
                sem3dmdw.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("datapass", "IMG_20221230_131358");
                        startActivity(intent);
                    }
                });

            } else if (str.equals("sixsem")) {
                one.setText("java");
                {
                    sem3ajp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221230_162305");
                            startActivity(intent);
                        }
                    });
                }
                two.setText("CN");
                {
                    sem3cd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221230_162245");
                            startActivity(intent);
                        }
                    });

                    three.setText("OS");
                    {
                        sem3eh.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162217");
                                startActivity(intent);
                            }
                        });
                    }
                    four.setText("PQT");
                    {
                        sem3ooad.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162016");
                                startActivity(intent);
                            }
                        });
                    }
                    five.setText("Egile");
                    {
                        sem3dmm.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162501");
                                startActivity(intent);
                            }
                        });
                    }
                    six.setText("EVS");
                    {
                        sem3dmdw.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162047");
                                startActivity(intent);
                            }
                        });
                    }
                }
            } else if (str.equals("sevensem")) {
                one.setText("RIA");
                {
                    sem3ajp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221231_004430");
                            startActivity(intent);
                        }
                    });
                }
                two.setText("CC");
                {
                    sem3cd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221231_004401");
                            startActivity(intent);
                        }
                    });

                    three.setText("BI&A");
                    {
                        sem3eh.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221231_004335");
                                startActivity(intent);
                            }
                        });
                    }
                    four.setText("AP");
                    {
                        sem3ooad.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(csesubj.this, "Syllabus is not available ", Toast.LENGTH_SHORT).show();

                      Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("datapass", "Firebase_DB_SnohTech");
                        startActivity(intent);
                            }
                        });
                    }
                    five.setText("SC");
                    {
                        sem3dmm.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(csesubj.this, "Syllabus is not available ", Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
//                        intent.putExtra("datapass", "IMG_20221230_162501");
//                        startActivity(intent);
                            }
                        });
                    }
                    six.setText("NULL");
                    {
                        sem3dmdw.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(csesubj.this, "Subject Over.", Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
//                        intent.putExtra("datapass", "IMG_20221230_162047");
//                        startActivity(intent);
                            }
                        });
                    }
                }
            } else if (str.equals("eightsem")) {
                one.setText("java");
                {
                    sem3ajp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221230_162305");
                            startActivity(intent);
                        }
                    });
                }
                two.setText("CN");
                {
                    sem3cd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("datapass", "IMG_20221230_162245");
                            startActivity(intent);
                        }
                    });

                    three.setText("OS");
                    {
                        sem3eh.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162217");
                                startActivity(intent);
                            }
                        });
                    }
                    four.setText("PQT");
                    {
                        sem3ooad.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162016");
                                startActivity(intent);
                            }
                        });
                    }
                    five.setText("Egile");
                    {
                        sem3dmm.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162501");
                                startActivity(intent);
                            }
                        });
                    }
                    six.setText("EVS");
                    {
                        sem3dmdw.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                                intent.putExtra("datapass", "IMG_20221230_162047");
                                startActivity(intent);
                            }
                        });
                    }
                }
            }
        }
    }
